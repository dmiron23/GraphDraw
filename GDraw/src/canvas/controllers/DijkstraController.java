package canvas.controllers;

import graphics.ActiveLine;
import graphics.Circle;
import graphics.GraphicsObject;
import graphics.LabeledLine;
import graphics.Layer;
import graphics.Node;
import graphics.Rectangle;
import graphics.TweenClass.Tween;
import graphics.TweenClass.TweenEvent;

import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import canvas.AnimationControl;
import canvas.DelayThread;
import canvas.FileCreator;
import canvas.canvas;

public class DijkstraController extends AnimationControl {
	private int option = 0;//default
	private int nonOption = 0;//default
	public static int[][] matrix = new int[200][200];
	public int[][] a = new int[200][200];
	public static ArrayList<Node> nodes;
	private boolean done;
	private boolean drawingLine;
	private ActiveLine al;
	private Node currentNode;
	private boolean selectingNode;
	private Node root;
	private ArrayList<Node> unvisited;
	private ArrayList<Node> visited;
	private Circle nodeHighlight;
	private Circle pingCircle;
	private static Layer lineLayer;
	private int count = 0;
	private int aCount = 0;
	private Layer pingLayer;
	private static Layer nodeLayer;
	private Layer highLightLayer;
	private Layer bgLayer;
	private Node other;
	private ArrayList<Node> visitList;
	private static int numNodes;
	public ArrayList<String> graphData;
	private int pairSize;
	private int numPairs;
	private static ArrayList<Integer> autList1 = new ArrayList<Integer>();
	private static ArrayList<Integer> autList2 = new ArrayList<Integer>();
	private ArrayList<ArrayList<Integer>> niceList = new ArrayList<ArrayList<Integer>>();

	public DijkstraController(canvas _c, JTextArea _pseudo) {
		super(_c, _pseudo);
	}

	// TODO: To modify weight:
	// Allow user to select line, right click?
	// After this, locate the cached distance and modify value * weight.
	// Modify get node distance etc to use new cache.

	private void sortByDistance() {
		ArrayList<Node> sorted = new ArrayList<Node>();
		while (nodes.size() > 1) {
			Node n = nodes.get(0);
			int dis = distBetweenNodes(n, root);

			for (Node n2 : nodes) {
				int dist = distBetweenNodes(n2, root);
				if (n2 != n && dist < dis) {
					n = n2;
					dis = dist;
				}
			}
			nodes.remove(n);
			sorted.add(n);
		}
		sorted.add(nodes.get(0));
		nodes.clear();
		nodes.addAll(sorted);
	}

	@Override
	public void startAnimation() {

		done = false;
		Tween.ac = this;
		DelayThread.ac = this;
		drawingLine = selectingNode = false;
		nodes = new ArrayList<Node>();
		currentNode = root = null;
		t.start();
		bgLayer = c.createLayer();
		bgLayer.mouseEnabled = false;
		Rectangle r = c.createRect(0, 0, 773, 459,64);
		r.backgroundIdle = new Color(160, 160, 200);
		bgLayer.addChild(r);
		lineLayer = c.createLayer();
		pingLayer = c.createLayer();
		nodeLayer = c.createLayer();
		highLightLayer = c.createLayer();
		nodeHighlight = c.createCircle(0, 0, 20);
		nodeHighlight.alpha = 0;
		nodeHighlight.data = "highlightComplete";
		highLightLayer.addChild(nodeHighlight);
		pingCircle = c.createCircle(0, 0, 10);
		pingCircle.backgroundIdle = Color.magenta;
		pingCircle.alpha = 0;
		pingCircle.data = "pingComplete";
		pingLayer.addChild(pingCircle);
		visited = new ArrayList<Node>();
		unvisited = new ArrayList<Node>();
		other = null;
		visitList = new ArrayList<Node>();

	}

	private int getActualDistance(Node n, Node n2) {
		Point p1 = new Point(n.getXCenter(), n.getYCenter());
		return (int) distToNode(p1.x, p1.y, n2);
	}

	private int distBetweenNodes(Node n, Node n2) {
		LabeledLine ll = getEdge(n, n2);
		if (ll != null)
			return Integer.valueOf(ll.data.toString());
		Point p1 = new Point(n.getXCenter(), n.getYCenter());
		return (int) distToNode(p1.x, p1.y, n2);
	}

	private int distToNode(int x, int y, Node n) {
		Point p = new Point(x, y);
		Point p2 = new Point(n.getXCenter(), n.getYCenter());
		return (int) p.distance(p2);
	}

	public static Node addNode(int x, int y, int i) {
		String nodeName = Integer.toString(nodes.size());
		Node node = c.createNode(x - 2, y - 2);
		if (i != -1)
			node.name = Integer.toString(i);
		else
			node.name = nodeName;
		node.backgroundIdle = Color.black;
		nodes.add(node);
		nodeLayer.addChild(node);

		//HoverCircle circle = c.createHoverCircle(x, y, 100);
		//circle.name = nodeName;
		//hoverLayer.addChild(circle);
		//circle.backgroundActive = new Color(255, 0, 0);
		return node;
	}

	public static LabeledLine addEdge(Node n, Node n1) {
		Point p1 = new Point(
				n.getXCenter(), 
				n.getYCenter());
		Point p2 = new Point(n1.getXCenter(), n1.getYCenter());

		int dist = (int) p1.distance(p2);
		LabeledLine ll = c.createLabeledLine(p1.x, p1.y, p2.x, p2.y, 1,
				Integer.toString(dist), 10);

		ll.outlineAlpha = 50;
		ll.name = n.name + "." + n1.name; // Add edge name, unidirectional.
		n.addNeighbour(n1);
		n1.addNeighbour(n);
		lineLayer.addChild(ll);
		ll.data = dist;
		return ll;
	}

	public LabeledLine getEdge(Node n, Node n1) { // Return edge between nodes.
													// Checks both directions.
		String name1 = n.name + "." + n1.name;
		String name2 = n1.name + "." + n.name;
		for (GraphicsObject go : lineLayer.children)
			if (go.name != null)
				if (go.name.equals(name1) || go.name.equals(name2))
					return (LabeledLine) go;
		return null;
	}

	public void highlightPath(Node n) {
		if (n == root || n == null || n.pathToRoot.isEmpty())
			return;
		int i = n.pathToRoot.size() - 1;
		Node previous = n.pathToRoot.get(i);
		while (!previous.equals(root)) {
			getEdge(n, previous).lineThickness = 3;
			n = previous;
			previous = n.pathToRoot.get(--i);
		}
		getEdge(n, previous).lineThickness = 3;
	}

	public void clearPath() {
		for (GraphicsObject go : lineLayer.children)
			go.lineThickness = 1;
		// lines.clear();
	}

	private void setRootNode(Node n) {
		for (Node no : nodes) {
			no.backgroundIdle = Color.black;
			// no.backgroundIdle = new Color(169, 232, 238);
			// no.distance.text = "?";
		}
		n.backgroundIdle = Color.red;
		root = n;
		// root.distance.text = "0";
	}

	@Override
	public void handleMouse(int x, int y) {
		x = Math.max(20, Math.min(x, c.getWidth() - 20)); // Clip placement to
															// safe area.
		y = Math.max(30, Math.min(y, c.getHeight() - 20));
		boolean canCreateNode = true;

		Point p = null;
		if (al != null) {
			p = new Point(al.x, al.y);
			lineLayer.removeChild(al);
			al = null;
		}
		if (selectingNode) {
			for (Node n : nodes) {
				int dist = distToNode(x, y, n);
				if (dist < 10) {
					setRootNode(n);
				}
			}
		} else {
			for (Node n : nodes) {
				int dist = distToNode(x, y, n);
				if (dist < 20) {
					canCreateNode = false;

					// Hover.
					//hoverLayer.getObjectByName(n.name).hover = true;
				} else {

					//hoverLayer.getObjectByName(n.name).hover = false;
				}
				if (dist < 10) {

					canCreateNode = false;
					if (nodes.size() < 2)
						return;
					else {
						if (drawingLine) {
							if (p != null) {
								if (n.getNeighbours().contains(currentNode)
										|| currentNode == n)
									return;
								addEdge(n, currentNode);
							}
						} else {
							drawingLine = true;
							al = c.createActiveLine(n.getXCenter(),
									n.getYCenter(), 1);
							al.outlineAlpha = 50;
							lineLayer.addChild(al);
							currentNode = n;
						}
					}
				}
			}
			if (al == null)
				drawingLine = false;
			if (!canCreateNode || drawingLine || p != null
					|| nodes.size() >= 100)
				return;
			addNode(x, y,-1);
		}
	};

	@Override
	public void handleAltMouse(int x, int y) {
		for (GraphicsObject go : lineLayer.children) {
			LabeledLine ll = (LabeledLine) go;
			Point tempPoint = new Point(
					(ll.startPoint().x + ll.endPoint().x) / 2,
					(ll.startPoint().y + ll.endPoint().y) / 2);
			Point mouse = new Point(x, y);
			if (tempPoint.distance(mouse) < 8) {
				Object result = JOptionPane.showInputDialog(form,
						"Enter new weight:", ll.data);
				if (result != null) {
					try {
						int weight = Integer.parseInt((String) result);
						if (weight < 1) {
							JOptionPane.showMessageDialog(form,
									"Invalid number.", "Input error",
									JOptionPane.ERROR_MESSAGE);
							return;
						}
						ll.data = weight;
						ll.label.text = Integer.toString(weight);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(form, "Invalid number.",
								"Input error", JOptionPane.ERROR_MESSAGE);
					}
				}

			}

		}
	}

	@Override
	public boolean isIdle() {
		return true;
	}

	@Override
	public void handleMouseMove(int x, int y) {
		if (!done)
			return;
		clearPath();
		for (Node n : nodes) {
			int dist = distToNode(x, y, n);
			if (dist < 12) {
				highlightPath(n);
			}
		}
	}

	/*public void processB1(String key) {
		if (selectingNode)
			selectingNode = false;
		else
			selectingNode = true;

		if (selectingNode)
			for (GraphicsObject go : canvas.objects)
				if (go.getClass().equals(Node.class))
					go.alpha = 0;
	}*/

	@Override
	public void processClear() {

		nodeLayer.removeAll();
		pingLayer.removeAll();
		lineLayer.removeAll();
		highLightLayer.removeAll();
		c.removeAll();
		numNodes = 0;
		count =  0;
		aCount = 0;
		autList1 = new ArrayList<Integer>();
		autList2 = new ArrayList<Integer>();
		niceList = new ArrayList<ArrayList<Integer>>();
		matrix = new int[200][200];
		startAnimation();

		// used this for converting long lat coordinates to map to our canvas
		/*
		 * JFileChooser fc = new JFileChooser(); int returnVal =
		 * fc.showOpenDialog(null); File f = null; if (returnVal ==
		 * JFileChooser.APPROVE_OPTION) { f = fc.getSelectedFile();} try {
		 * FileCreator.write(f, UsaForm.formatFile(f)); } catch (IOException e)
		 * {}
		 */

	}

	public ArrayList<String> createPrintables() {
		ArrayList<String> printables = new ArrayList<String>();
		for (GraphicsObject go : nodeLayer.children)
			printables.add("n."
					+ Integer.toString(((Node) go).getXCenter() + 8) + "."
					+ Integer.toString(((Node) go).getYCenter() + 8));
		for (GraphicsObject go : lineLayer.children)
			printables.add("e." + ((LabeledLine) go).name + "."
					+ go.data.toString());

		return printables;
	}

	public void processB3(String key) {

		sortByDistance();
		unvisited = new ArrayList<Node>();
		unvisited.addAll(nodes);
		unvisited.remove(root);
		visited.add(root);
		for (Node n : unvisited)
			n.pathToRoot = new ArrayList<Node>();
		stateFlag = 1;
	}

	

	public void assignPathfromNode(Node n, Node nn) {
		n.pathToRoot = new ArrayList<Node>();
		n.pathToRoot.addAll(nn.pathToRoot);
		n.pathToRoot.add(nn);
	}

	@Override
	public void tick() {
		if (stateFlag == 1) {
			pingCircle.x = root.getXCenter();
			pingCircle.y = root.getYCenter();
			other = unvisited.get(0);
			int dis = getActualDistance(root, other);
			pingCircle.tweenTo(other.getXCenter(), other.getYCenter(), 255, 80,
					dis / 2, 0);
			pingCircle.tween.addTweenListener(this);
			currentNode = root;
			stateFlag = -1;

		} else if (stateFlag == 2) { // state flag for choosing the current node
			unvisited.clear();
			unvisited.addAll(nodes);
			for (Node a : visited)
				unvisited.remove(a);

			currentNode = selectCurrentNode();

			if (currentNode == null) {
				done = true;
				stateFlag = -1;
			} else {
				for (Node n : currentNode.getNeighbours())
					if (unvisited.contains(n)) {
						visitList.add(n);
					}
				currentNode.backgroundIdle = new Color(221, 169, 238);// puyple
				currentNode.backgroundIdle = Color.green;
				unvisited.remove(currentNode);
				visited.add(currentNode);
				stateFlag = 3;
			}
		} else if (stateFlag == 3) {
			if (visitList.size() == 0) {
				clearPath();
				dT = new DelayThread(200, 2);
			} else {
				other = visitList.get(0);
				pingCircle.x = currentNode.getXCenter();
				pingCircle.y = currentNode.getYCenter();
				int dis = distBetweenNodes(currentNode, other);
				pingCircle.data = "checkComplete";
				pingCircle.tweenTo(other.getXCenter(), other.getYCenter(), 255,
						80, dis / 2, 0);
				pingCircle.tween.addTweenListener(this);
			}
			stateFlag = -1;
		}

		c.updateCanvas();
	}

	private Node selectCurrentNode() {
		int min = Integer.MAX_VALUE;
		Node m = null;
		for (Node n : unvisited) {
			int dis = computePathLength(n);
			if (dis != -1 && dis < min) {
				min = dis;
				m = n;
			}
		}
		if (m != null) {
			clearPath();
			highlightPath(m);
		}
		return m;
	}

	@Override
	public void tweenCompleted(TweenEvent event) {
		Tween t = (Tween) event.getSource();
		String d = (String) t.go.data;
		if (d.equals("pingComplete")) {
			// We just pinged a node.

			other = unvisited.get(0);
			int dis = distBetweenNodes(root, other);

			if (root.getNeighbours().contains(other)) {
				// other.distance.text = Integer.toString(dis);
				nodeHighlight.backgroundIdle = Color.green;
				other.pathToRoot.add(root);
			} else {
				// other.distance.text = "Inf";
				nodeHighlight.backgroundIdle = Color.red;
			}
			unvisited.remove(0);
			nodeHighlight.x = other.getXCenter();
			nodeHighlight.y = other.getYCenter();
			nodeHighlight.tweenTo(nodeHighlight.x, nodeHighlight.y, 255, 0, 30,
					0);
			nodeHighlight.tween.addTweenListener(this);
			t.go.alpha = 0;

		} else if (d.equals("highlightComplete")) {
			if (unvisited.size() == 0)
				dT = new DelayThread(100, 2);
			else
				dT = new DelayThread(100, 1);
		} else if (d.equals("checkComplete")) {
			if (currentNode.getNeighbours().contains(other)) {
				int pathLength = computePathLength(currentNode)
						+ distBetweenNodes(currentNode, other);
				// if (other.distance.text.equals("Inf")) {
				// other.distance.text = Integer.toString(pathLength);
				assignPathfromNode(other, currentNode);
			} else {
				int otherPathLength = computePathLength(other);
				// if (pathLength < otherPathLength) {
				// other.distance.text = Integer.toString(pathLength);
				assignPathfromNode(other, currentNode);
			}
		}
		// }

		// visitList.remove(other);
		dT = new DelayThread(100, 3);
		t.go.alpha = 0;
		// }

	}

	public int computePathLength(Node n) {
		// quick fix for NullPointerException
		boolean contains;
		try {
			contains = n.pathToRoot.contains(root);
		} catch (NullPointerException e) {
			contains = false;
		}

		if (!contains)
			return -1;
		int pathLength = 0;
		Node current = root;
		for (Node nn : n.pathToRoot) {
			pathLength += distBetweenNodes(current, nn);
			current = nn;
		}
		pathLength += distBetweenNodes(current, n);
		return pathLength;
	}

	@Override
	public void processMenu(String menuItem) {
		if (menuItem.equals("Export")) {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File f = fc.getSelectedFile();
				try {
					FileCreator.write(f, createPrintables());
				} catch (IOException e) {
				}
			}
		}

	}

	@Override
	public void setList(ArrayList<String> wordList) {
		graphData = wordList;
	}

	@Override
	public void insertMultiple() {
		while (!graphData.isEmpty())
			processEntry(graphData.remove(0));
	}

	public void processEntry(String entry) {
		if (entry.length() > 1) {
			ArrayList<String> args = new ArrayList<String>();
			StringTokenizer st = new StringTokenizer(entry);
			String s = st.nextToken(".");
			while (!s.isEmpty()) {
				args.add(s);
				try {
					s = st.nextToken(".");
				} catch (Exception e) {
					s = "";
				}
			}

			if (args.get(0).equals("n")) {
				Node n = addNode(Integer.valueOf(args.get(1)),
						Integer.valueOf(args.get(2)),-1);
			} else if (args.get(0).equals("e")) {
				Node n1 = (Node) nodeLayer.getObjectByName(args.get(1));
				Node n2 = (Node) nodeLayer.getObjectByName(args.get(2));
				int weight = Integer.valueOf(args.get(3));

				LabeledLine ll = addEdge(n1, n2);
				ll.data = weight;
				ll.label.text = Integer.toString(weight);
			} else if (args.get(0).equals("t")) {
				processClear();
				count = 0;
				numNodes = Integer.valueOf(args.get(1));
			

			}else if (args.get(0).equals("m")) {
				for (int i = 1; i <= numNodes; i++){
					matrix[count][i-1] = Integer.valueOf(args.get(i));
					
					
					
					
			}
				count++;
			}else if (args.get(0).equals("ta")){
				aCount = 0;
				autList1 = new ArrayList<Integer>();
				autList2 = new ArrayList<Integer>();
				niceList = new ArrayList<ArrayList<Integer>>();
				pairSize = Integer.valueOf(args.get(1));
				numPairs = Integer.valueOf(args.get(2));
				
			}else if (args.get(0).equals("a")){
				for (int i = 0; i < pairSize; i++){
					a[aCount][i] = Integer.valueOf(args.get(i+1));
					autList1.add(Integer.valueOf(args.get(i+1)));
					
				}
				System.out.println();
				aCount++;
				
			}else if (args.get(0).equals("f")){
				
				System.out.println("drawing");
				
				//create niceList
				niceList = new ArrayList<ArrayList<Integer>>();
				for (int u = 0; u < pairSize; u++)
					niceList.add(new ArrayList<Integer>());
				
				for (int i=0;i<pairSize;i++)
					for (int j=0;j<numPairs;j++)
						autList2.add(a[j][i]);
						
				
				System.out.println("pairSize=" + pairSize);
				System.out.println("numPairs=" + numPairs);
				for (int x = 0; x < pairSize; x++)
					for (int y = 0; y < numPairs; y++)
					{
						
						niceList.get(x).add(a[y][x]);
					}
				
				System.out.println(niceList);
				System.out.println(autList1);
				System.out.println(autList2);
				draw(option,nonOption);
				//draws the nodes
				
				
				
				
			
			}
			}
		

	}
	
	private static void draw(int option, int nonOption) {
		if (option == 0)// draw randomly
			drawRandomly(numNodes);
		if (option == 1)// draw randomly on circle
			drawRandomlyOnCircle(numNodes);
		if (option == 2)// draw on a circle split by the automorphism group (1)
			drawOnCircleByAutomorphism(nonOption, true);
		if (option == 3)// draw on a circle split by the automorphism group (2)
			drawOnCircleByAutomorphism(nonOption, false);

	}

	private static void drawOnCircleByAutomorphism(int nonAutOption, boolean a) {
		// draw the nodes
		ArrayList<Integer> usedList = (a) ? autList1 : autList2;
		ArrayList<Integer> nonAutList = new ArrayList<Integer>();
		for (int i = 0; i < numNodes; i++) {
			if (usedList.contains(i + 1)) {// this means that the node is in the
											// automorphism group and should be
											// on the outer circle
				addNode(getAutCricleX(i + 1, usedList),
						getAutCricleY(i + 1, usedList), i);
			} else
				// this means that the node is not in the automorphism group
				nonAutList.add(i);
		}
		if (nonAutOption == 0)// draw nodes on circle in the middle
			for (int j = 0; j < numNodes; j++)
				if (nonAutList.contains(j)) {
					addNode(getNonAutCricleX(j, nonAutList),
							getNonAutCricleY(j, nonAutList), j);
				}

		// draw the edges
		drawEdges();

	}

	private static int getNonAutCricleY(int j, ArrayList<Integer> bList) {
		return (int) (278 + 80*Math.sin(bList.indexOf(j)*(2*Math.PI/bList.size())));
	}

	private static int getNonAutCricleX(int j, ArrayList<Integer> bList) {
		return (int) (444 + 80*Math.cos(bList.indexOf(j)*(2*Math.PI/bList.size())));
	}

	private static int getAutCricleY(int i, ArrayList<Integer> usedList) {
		
		return (int) (278 + 240*Math.sin(usedList.indexOf(i)*(2*Math.PI/usedList.size())));
	}

	private static int getAutCricleX(int i, ArrayList<Integer> usedList) {
		
		return (int) (444 + 240*Math.cos(usedList.indexOf(i) *(2*Math.PI/usedList.size())));
	}

	private static void drawRandomlyOnCircle(int numNodes) {
		//draw the nodes
		for (int i = 0; i < numNodes; i++)
			addNode(getRandomCircleX(numNodes,i),getRandomCircleY(numNodes,i),-1);
		//draw the edges
		drawEdges();
		
	}

	private static void drawRandomly(int numNodes) {
		//draw the nodes
		for (int i = 0; i < numNodes; i++) 
			addNode(getRandomX(),getRandomY(),-1);
		//draw the edges
		drawEdges();
				
	}
	
	private static void drawEdges(){
		for (int j = 0; j < numNodes; j++)
			for (int k = 0; k < numNodes; k++)
				if (matrix[j][k] == 1){
						Node n1 = (Node) nodeLayer.getObjectByName(Integer.toString(j));
						Node n2 = (Node) nodeLayer.getObjectByName(Integer.toString(k));
						addEdge(n1, n2);
		}
	}

	public static ArrayList<Point> getCirclesCentres(int num){
		ArrayList<Point> centres = new ArrayList<Point>();
		double sliceAngle = 2*Math.PI/num;
		for (int i = 0; i < num; i++){
			centres.add(new Point((int)(444+170*Math.cos(i*sliceAngle)),(int)(278+170*Math.sin(i*sliceAngle))));
		}
		
		System.out.println(centres);
		return centres;
	}
	public static int randomGenerator(int min, int max) {
		Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	private Point getPoint(int i) {
		Point returned = new Point();
		int circleIndex = 0;
		int index = 0;
		if (autList1.contains(i)){
			numNodes = numPairs;
			//calc index
			circleIndex = calcCircleIndex(i);
			System.out.println(circleIndex);
			
			index = calcIndex(i,circleIndex);
			System.out.println(index);
			
			Point Centre = getCirclesCentres(pairSize).get(circleIndex);
			double sliceAngle = 2*Math.PI/numNodes;
			double angle = index*sliceAngle;
			returned.x = (int) (Centre.x + 70*Math.cos(angle));
			
			returned.y = (int) (Centre.y + 70*Math.sin(angle));
			
			return returned;
		}else{return getPointNonGroup(i);
						
		}
		
	}

	private Point getPointNonGroup(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private int calcIndex(int i, int circleIndex) {
		return niceList.get(circleIndex).indexOf(i+1);
	}

	private int calcCircleIndex(int i) {
		for (int j = 0; j < pairSize; j++)
			if (niceList.get(j).contains(i+1))
				return j;
		return -1;
	}

	private static int getRandomCircleX(int numNodes, int i) {
		double sliceAngle = 2*Math.PI/numNodes;
		double angle = i*sliceAngle;
		return (int) (444 + 240*Math.cos(angle));
	}
	
	private static int getRandomCircleY(int numNodes, int i) {
		double sliceAngle = 2*Math.PI/numNodes;
		double angle = i*sliceAngle;
		return (int) (278 + 240*Math.sin(angle));
	}

	
	private static int getRandomX() {
		return randomGenerator(28, 860);
	}

	private static int getRandomY() {
		return randomGenerator(38, 519);
	}

	@Override
	public String getTitle() {
		return "Disjkstra's Shortest Path";
	}

	@Override
	public void setNonAutOption(int i) {
		nonOption = i;
		
	}

	@Override
	public void setAutOption(int i) {
		option = i;
		
	}
}
