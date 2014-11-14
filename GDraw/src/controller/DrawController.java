package controller;

import graphics.ActiveLine;
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class DrawController extends AnimationControl {
	private File lastFile;
	private int option = 0;// default
	private int nonOption = 0;// default
	public static int[][] matrix = new int[200][200];
	public int[][] a = new int[200][200];
	public static ArrayList<Node> nodes;
	private boolean done;
	private boolean drawingLine;
	private ActiveLine al;
	private Node currentNode;
	private boolean selectingNode;
	private Node root;
	private static Layer lineLayer;
	private int count = 0;
	private int aCount = 0;
	private static Layer nodeLayer;
	private Layer bgLayer;
	private static int numNodes;
	public ArrayList<String> graphData;
	private static int pairSize;
	private static int numPairs;
	private static ArrayList<Integer> autList1 = new ArrayList<Integer>();
	private static ArrayList<Integer> autList2 = new ArrayList<Integer>();
	private static ArrayList<ArrayList<Integer>> niceListA = new ArrayList<ArrayList<Integer>>();
	private static ArrayList<ArrayList<Integer>> niceListB = new ArrayList<ArrayList<Integer>>();

	public DrawController(canvas _c, JTextArea _pseudo) {
		super(_c, _pseudo);
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
		Rectangle r = c.createRect(0, 0, 773, 459);
		r.backgroundIdle = new Color(160, 160, 200);
		bgLayer.addChild(r);
		lineLayer = c.createLayer();
		nodeLayer = c.createLayer();
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
		return node;
	}

	public static LabeledLine addEdge(Node n, Node n1) {
		Point p1 = new Point(n.getXCenter(), n.getYCenter());
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
					// hoverLayer.getObjectByName(n.name).hover = true;
				} else {
					// hoverLayer.getObjectByName(n.name).hover = false;
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
			addNode(x, y, -1);
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

	@Override
	public void processClear() {
		nodeLayer.removeAll();
		lineLayer.removeAll();
		c.removeAll();
		numNodes = 0;
		count = 0;
		aCount = 0;
		autList1 = new ArrayList<Integer>();
		autList2 = new ArrayList<Integer>();
		niceListA = new ArrayList<ArrayList<Integer>>();
		niceListB = new ArrayList<ArrayList<Integer>>();
		matrix = new int[200][200];
		startAnimation();
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

	@Override
	public void tick() {
		c.updateCanvas();
	}

	@Override
	public void tweenCompleted(TweenEvent event) {
		Tween t = (Tween) event.getSource();
		dT = new DelayThread(100, 3);
		t.go.alpha = 0;
	}

	@Override
	public void processExport() {
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
				addNode(Integer.valueOf(args.get(1)),
						Integer.valueOf(args.get(2)), -1);
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
			} else if (args.get(0).equals("m")) {
				for (int i = 1; i <= numNodes; i++) {
					matrix[count][i - 1] = Integer.valueOf(args.get(i));
				}
				count++;
			} else if (args.get(0).equals("ta")) {
				aCount = 0;
				autList1 = new ArrayList<Integer>();
				autList2 = new ArrayList<Integer>();
				niceListA = new ArrayList<ArrayList<Integer>>();
				niceListB = new ArrayList<ArrayList<Integer>>();
				pairSize = Integer.valueOf(args.get(1));
				numPairs = Integer.valueOf(args.get(2));
			} else if (args.get(0).equals("a")) {
				for (int i = 0; i < pairSize; i++) {
					a[aCount][i] = Integer.valueOf(args.get(i + 1));
					autList1.add(Integer.valueOf(args.get(i + 1)));
				}
				aCount++;
			} else if (args.get(0).equals("f")) {
				// create niceListA
				niceListA = new ArrayList<ArrayList<Integer>>();
				for (int u = 0; u < pairSize; u++)
					niceListA.add(new ArrayList<Integer>());
				for (int i = 0; i < pairSize; i++)
					for (int j = 0; j < numPairs; j++)
						autList2.add(a[j][i]);
				for (int x = 0; x < pairSize; x++)
					for (int y = 0; y < numPairs; y++)
						niceListA.get(x).add(a[y][x]);
				// create niceListB
				niceListB = new ArrayList<ArrayList<Integer>>();
				for (int i = 0; i < numPairs; i++) {
					niceListB.add(new ArrayList<Integer>());
					for (int j = 0; j < pairSize; j++)
						niceListB.get(i).add(a[i][j]);
				}
				draw(option, nonOption);
			}
		}
	}

	private static void draw(int option, int nonOption) {
		System.out.println("option = " + option);
		if (option == 0)// draw randomly
			drawRandomly(numNodes);
		if (option == 1)// draw randomly on circle
			drawRandomlyOnCircle(numNodes);
		if (option == 2)// draw on a circle split by the automorphism group (1)
			drawOnCircleByAutomorphism(nonOption, true);
		if (option == 3)// draw on a circle split by the automorphism group (2)
			drawOnCircleByAutomorphism(nonOption, false);
		if (option == 4)// draw on multiple circles split by the automorphism
						// group (1)
			drawOnMultipleCirclesByAutomorphism(nonOption, true);
		if (option == 5)// draw on multiple circles split by the automorphism
						// group (2)
			drawOnMultipleCirclesByAutomorphism(nonOption, false);
	}

	private static void drawOnMultipleCirclesByAutomorphism(int nonAutOption,
			boolean a) {
		ArrayList<Integer> usedList = (a) ? autList1 : autList2;
		ArrayList<Integer> nonAutList = new ArrayList<Integer>();
		for (int i = 0; i < numNodes; i++) {
			if (usedList.contains(i + 1)) {
				addNode(getMultipleX(i + 1, usedList, a),
						getMultipleY(i + 1, usedList, a), i);
			} else
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

	public static ArrayList<Point> getCirclesCentres(int num) {
		ArrayList<Point> centres = new ArrayList<Point>();
		double sliceAngle = 2 * Math.PI / num;
		for (int i = 0; i < num; i++) {
			centres.add(new Point((int) (444 + 170 * Math.cos(i * sliceAngle)),
					(int) (278 + 170 * Math.sin(i * sliceAngle))));
		}
		return centres;
	}

	private static int calcCircleIndex(int i, boolean a) {
		ArrayList<ArrayList<Integer>> used = (a) ? niceListA : niceListB;
		int size = (a) ? pairSize : numPairs;
		for (int j = 0; j < size; j++)
			if (used.get(j).contains(i))
				return j;
		return -1;
	}

	private static int getMultipleX(int i, ArrayList<Integer> usedList,
			boolean a) {
		int numCircles = 0;
		int numPerCircle = 0;
		int circleIndex = 0;
		int onCircleIndex = 0;
		int circleCentreX = 0;
		if (a) {
			
			numCircles = pairSize;
			numPerCircle = numPairs;
			circleIndex = calcCircleIndex(i, a);
			onCircleIndex = niceListA.get(circleIndex).indexOf(i);
			circleCentreX = getCircleCentreX(circleIndex, numCircles);
		} else {
			numCircles = numPairs;
			numPerCircle = pairSize;
			circleIndex = calcCircleIndex(i, a);
			onCircleIndex = niceListB.get(circleIndex).indexOf(i);
			circleCentreX = getCircleCentreX(circleIndex, numCircles);
		}

		return (int) (circleCentreX + 50 * Math.cos((2 * Math.PI*circleIndex/numCircles) + onCircleIndex
				* (2 * Math.PI / numPerCircle)));
	}

	private static int getMultipleY(int i, ArrayList<Integer> usedList,
			boolean a) {
		int numCircles = 0;
		int numPerCircle = 0;
		int circleIndex = 0;
		int onCircleIndex = 0;
		int circleCentreY = 0;
		if (a) {
			numCircles = pairSize;
			numPerCircle = numPairs;
			circleIndex = calcCircleIndex(i, a);
			onCircleIndex = niceListA.get(circleIndex).indexOf(i);
			circleCentreY = getCircleCentreY(circleIndex, numCircles);
		} else {
			numCircles = numPairs;
			numPerCircle = pairSize;
			circleIndex = calcCircleIndex(i, a);
			onCircleIndex = niceListB.get(circleIndex).indexOf(i);
			circleCentreY = getCircleCentreY(circleIndex, numCircles);

		}
		return (int) (circleCentreY + 50 * Math.sin((2 * Math.PI*circleIndex/numCircles) + onCircleIndex
				* (2 * Math.PI / numPerCircle)));
	}

	private static int getCircleCentreY(int circleIndex, int numCircles) {
		return (int) (224 + 150 * Math.sin(circleIndex
				* (2 * Math.PI / numCircles)));
	}

	private static int getCircleCentreX(int circleIndex, int numCircles) {
		return (int) (386 + 150 * Math.cos(circleIndex
				* (2 * Math.PI / numCircles)));
	}

	private static void drawOnCircleByAutomorphism(int nonAutOption, boolean a) {
		// draw the nodes
		ArrayList<Integer> usedList = (a) ? autList1 : autList2;
		ArrayList<Integer> nonAutList = new ArrayList<Integer>();
		for (int i = 0; i < numNodes; i++) {
			if (usedList.contains(i + 1)) {
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
		return (int) (224 + 50 * Math.sin(bList.indexOf(j)
				* (2 * Math.PI / bList.size())));
	}

	private static int getNonAutCricleX(int j, ArrayList<Integer> bList) {
		return (int) (386 + 50 * Math.cos(bList.indexOf(j)
				* (2 * Math.PI / bList.size())));
	}

	private static int getAutCricleY(int i, ArrayList<Integer> usedList) {
		return (int) (224 + 210 * Math.sin(usedList.indexOf(i)
				* (2 * Math.PI / usedList.size())));
	}

	private static int getAutCricleX(int i, ArrayList<Integer> usedList) {
		return (int) (386 + 210 * Math.cos(usedList.indexOf(i)
				* (2 * Math.PI / usedList.size())));
	}

	private static void drawRandomlyOnCircle(int numNodes) {
		// draw the nodes
		ArrayList<Integer> randomArray = new ArrayList<Integer>();
		for (int i = 0; i < numNodes; i++)
			randomArray.add(0);
		for (int i = 0; i < numNodes; i++){
			//determine random position, make sure no collisions
			int random = randomGenerator(0, numNodes-1);
			while (randomArray.get(random) == 1){
				random = randomGenerator(0, numNodes-1);
			}
			randomArray.set(random, 1);
			addNode(getRandomCircleX(numNodes, random),
					getRandomCircleY(numNodes, random), -1);
			}
		// draw the edges
		drawEdges();
	}

	private static void drawRandomly(int numNodes) {
		// draw the nodes
		for (int i = 0; i < numNodes; i++)
			addNode(getRandomX(), getRandomY(), -1);
		// draw the edges
		drawEdges();
	}

	private static void drawEdges() {
		for (int j = 0; j < numNodes; j++)
			for (int k = 0; k < numNodes; k++)
				if (matrix[j][k] == 1) {
					Node n1 = (Node) nodeLayer.getObjectByName(Integer
							.toString(j));
					Node n2 = (Node) nodeLayer.getObjectByName(Integer
							.toString(k));
					addEdge(n1, n2);
				}
	}

	public static int randomGenerator(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	private static int getRandomCircleX(int numNodes, int i) {
		double sliceAngle = 2 * Math.PI / numNodes;
		double angle = i * sliceAngle;
		return (int) (386 + 210 * Math.cos(angle));
	}

	private static int getRandomCircleY(int numNodes, int i) {
		double sliceAngle = 2 * Math.PI / numNodes;
		double angle = i * sliceAngle;
		return (int) (224 + 210 * Math.sin(angle));
	}

	private static int getRandomX() {
		return randomGenerator(5, 768);
	}

	private static int getRandomY() {
		return randomGenerator(5, 454);
	}

	@Override
	public String getTitle() {
		return "GraphDraw";
	}

	@Override
	public void setNonAutOption(int i) {
		nonOption = i;
	}

	@Override
	public void setAutOption(int i) {
		option = i;
	}

	@Override
	public void redraw() {
		if (lastFile != null)
			processImport(lastFile);
	}
	
	@Override
	public void processImport(File file){
		lastFile = file;
		try {
			FileInputStream fis = new FileInputStream(file);
			//
			StringBuilder builder = new StringBuilder();
			int ch;
			try {
				while ((ch = fis.read()) != -1) {
					builder.append((char) ch);
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			ArrayList<String> wordList = new ArrayList<String>();
			String[] entries = builder.toString().replace("\r", "")
					.split("\n");
			for (String entry : entries) {
				wordList.add(entry);
			}
			setList(wordList);
			insertMultiple();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
