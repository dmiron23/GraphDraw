package controller;

import graphics.ActiveLine;
import graphics.CenteredLabel;
import graphics.GraphicsObject;
import graphics.LabeledLine;
import graphics.Layer;
import graphics.Node;
import graphics.Rectangle;
import graphics.TweenClass.Tween;
import graphics.TweenClass.TweenEvent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.font.GlyphVector;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import org.apache.felix.resolver.FelixResolveContext;

import Main.Window;
import canvas.AnimationControl;
import canvas.DelayThread;
import canvas.FileCreator;
import canvas.canvas;

public class DrawController extends AnimationControl {
	private File lastFile;
	protected static double clusterDistance = 1.0;
	private int option = 0;// default
	private static boolean graphRepAvailable = false;
	private int nonOption = 0;// default
	public static int[][] matrix = new int[200][200];
	private static String whereImAt = "";
	public int[][] a = new int[200][200];
	public static ArrayList<Node> nodes;
	private boolean done;
	private boolean drawingLine;
	private ActiveLine al;
	private Node currentNode;
	private boolean selectingNode;
	private Node root;
	private static Layer lineLayer;
	private static int i = 0;
	private static Layer nodeLayer;
	private Layer bgLayer;
	private static int numNodes;
	public ArrayList<String> graphData;
	private static int pairSize;
	private static int numPairs;
	private static boolean ab;
	private static ArrayList<Integer> usedList;
	private static ArrayList<Integer> autList1 = new ArrayList<Integer>();
	private static ArrayList<Integer> autList2 = new ArrayList<Integer>();
	private static ArrayList<ArrayList<Integer>> niceListA = new ArrayList<ArrayList<Integer>>();
	private static ArrayList<ArrayList<Integer>> niceListB = new ArrayList<ArrayList<Integer>>();
	private static ArrayList<Integer> nonAutList = new ArrayList<Integer>();
	private static int vSize = 50;

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
		Rectangle r = c.createRect(0, 0, 773, 500);
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
		Node node = null;

		if (i != -1) {

			node = c.createNode(x - 6, y - 6, Integer.toString(i));
		} else {

			node = c.createNode(x - 6, y - 6, nodeName);
		}
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
				Integer.toString(dist), 40);
		ll.outlineAlpha = 100;
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
		y = Math.max(20, Math.min(y, c.getHeight() - 20));
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
				if (dist < 20) {
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
		autList1 = new ArrayList<Integer>();
		autList2 = new ArrayList<Integer>();
		niceListA = new ArrayList<ArrayList<Integer>>();
		niceListB = new ArrayList<ArrayList<Integer>>();
		matrix = new int[200][200];
		startAnimation();
	}

	public ArrayList<String> createPrintables() {
		ArrayList<String> printables = new ArrayList<String>();

		int n = nodeLayer.children.size();

		// Title
		printables.add("Graph: " + n + " nodes");
		String separationLine = "";
		for (int i = 0; i <= 2 * n; i++)
			separationLine += "-";
		printables.add(separationLine);

		// Matrix
		for (int i = 0; i < n; i++) {
			String line = "[";
			for (int j = 0; j < n; j++) {
				if (j != n - 1)
					line += matrix[i][j] + ",";
				else
					line += matrix[i][j] + "]";
			}
			printables.add(line);
		}

		printables.add(separationLine);

		// Automorphism

		printables.add("Automorphism: " + pairSize + "x" + numPairs);

		printables.add(separationLine);

		for (int i = 0; i < numPairs; i++) {
			String line = "[";
			for (int j = 0; j < pairSize; j++) {
				if (j != pairSize - 1)
					line += a[i][j] + ",";
				else
					line += a[i][j] + "]";
			}
			printables.add(line);
		}

		printables.add(separationLine);

		// Graphical representation
		// 1.Nodes

		printables.add("Graphical representation:");
		printables.add(separationLine);
		printables.add("Nodes: " + n + " nodes");
		printables.add(separationLine);

		for (GraphicsObject go : nodeLayer.children)
			printables.add("[" + Integer.toString(((Node) go).getXCenter())
					+ "," + Integer.toString(((Node) go).getYCenter()) + ","
					+ ((Node) go).name + "]");

		printables.add(separationLine);
		printables.add("Edges: " + lineLayer.children.size() / 2 + " edges");
		printables.add(separationLine);

		for (GraphicsObject go : lineLayer.children) {

			String name = ((LabeledLine) go).name;
			String names[] = new String[3];
			names = name.split("\\.");

			if (Integer.parseInt(names[0]) < Integer.parseInt(names[1]))
				printables.add("[" + ((LabeledLine) go).name.replace(".", ",")
						+ "]");

		}

		printables.add(separationLine);
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
	public void processImportDemo() {
		File f = new File("demo.txt");
		ArrayList<String> demoLines = new ArrayList<String>();
		demoLines.add("Graph: 21 nodes");
		demoLines.add("-------------------------------------------");
		demoLines.add("[0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
		demoLines.add("[1,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0]");
		demoLines.add("[1,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0]");
		demoLines.add("[1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0]");
		demoLines.add("[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0]");
		demoLines.add("[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1]");
		demoLines.add("[0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0]");
		demoLines.add("[0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0]");
		demoLines.add("[0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0]");
		demoLines.add("[0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,0,0]");
		demoLines.add("[0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0]");
		demoLines.add("[0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1]");
		demoLines.add("[0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0]");
		demoLines.add("[0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1]");
		demoLines.add("[0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,0]");
		demoLines.add("[0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1]");
		demoLines.add("[0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0]");
		demoLines.add("[0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0]");
		demoLines.add("[0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0]");
		demoLines.add("[0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0]");
		demoLines.add("[0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0]");
		demoLines.add("-------------------------------------------");
		demoLines.add("Automorphism: 3x5");
		demoLines.add("-------------------------------------------");
		demoLines.add("[1,8,7]");
		demoLines.add("[3,17,13]");
		demoLines.add("[4,11,19]");
		demoLines.add("[5,20,10]");
		demoLines.add("[6,14,16]");
		demoLines.add("-------------------------------------------");

		try {
			FileCreator.write(f, demoLines);
		} catch (IOException e) {
			e.printStackTrace();
		}

		processImport(f);
	}

	@Override
	public void setList(ArrayList<String> wordList) {
		graphData = wordList;
	}

	@Override
	public void insertMultiple() {
		while (!graphData.isEmpty())
			processEntry(graphData.remove(0));

		if (graphRepAvailable == false)
			draw(option, nonOption);
	}

	public void processEntry(String entry) {
		if (entry.length() == 0)
			return;
		// first line "Graph: x nodes"
		if (entry.contains("Graph:")) {
			entry = entry.replace("Graph: ", "");
			entry = entry.replace(" nodes", "");
			processClear();
			numNodes = Integer.valueOf(entry);
			whereImAt = "adding to matrix";
			i = 0;
		} else if (entry.contains("-")) {
			// do nothing
		} else if (entry.contains("Automorphism")) {
			entry = entry.replace("Automorphism: ", "");

			ArrayList<String> args = new ArrayList<String>();
			StringTokenizer st = new StringTokenizer(entry);
			String s = st.nextToken("x");
			while (!s.isEmpty()) {
				args.add(s);
				try {
					s = st.nextToken("x");
				} catch (Exception e) {
					s = "";
				}
			}
			autList1 = new ArrayList<Integer>();
			autList2 = new ArrayList<Integer>();
			niceListA = new ArrayList<ArrayList<Integer>>();
			niceListB = new ArrayList<ArrayList<Integer>>();
			pairSize = Integer.valueOf(args.get(0));
			numPairs = Integer.valueOf(args.get(1));
			whereImAt = "adding to automorphism";
			i = 0;
		} else if (entry.contains("Graphical representation:")) {

			graphRepAvailable = true;
		} else if (entry.contains("Nodes: ")) {
			whereImAt = "adding nodes on plane";
		} else if (entry.contains("Edges:")) {
			whereImAt = "adding edges";
		} else if (whereImAt.equals("adding nodes on plane")) {
			// my entry looks like this: [x,x,x,x,x,x,x,x]
			entry = entry.replace("[", "");
			entry = entry.replace("]", "");
			ArrayList<String> args = new ArrayList<String>();
			StringTokenizer st = new StringTokenizer(entry);
			String s = st.nextToken(",");
			while (!s.isEmpty()) {
				args.add(s);
				try {
					s = st.nextToken(",");
				} catch (Exception e) {
					s = "";
				}
			}

			addNode(Integer.valueOf(args.get(0)), Integer.valueOf(args.get(1)),
					Integer.valueOf(args.get(2)));
		} else if (whereImAt.equals("adding edges")) {
			// my entry looks like this: [x,x,x,x,x,x,x,x]
			entry = entry.replace("[", "");
			entry = entry.replace("]", "");
			ArrayList<String> args = new ArrayList<String>();
			StringTokenizer st = new StringTokenizer(entry);
			String s = st.nextToken(",");
			while (!s.isEmpty()) {
				args.add(s);
				try {
					s = st.nextToken(",");
				} catch (Exception e) {
					s = "";
				}
			}
			Node n1 = (Node) nodeLayer.getObjectByName(args.get(0));
			Node n2 = (Node) nodeLayer.getObjectByName(args.get(1));
			addEdge(n1, n2);
		} else if (whereImAt.equals("adding to matrix")) {
			// my entry looks like this: [x,x,x,x,x,x,x,x]
			entry = entry.replace("[", "");
			entry = entry.replace("]", "");
			ArrayList<String> args = new ArrayList<String>();
			StringTokenizer st = new StringTokenizer(entry);
			String s = st.nextToken(",");
			while (!s.isEmpty()) {
				args.add(s);
				try {
					s = st.nextToken(",");
				} catch (Exception e) {
					s = "";
				}

			}
			for (int j = 0; j < args.size(); j++) {
				matrix[i][j] = Integer.parseInt(args.get(j));
			}
			i++;

		} else if (whereImAt.equals("adding to automorphism")) {
			// my entry looks like this: [x,x,x,x,x,x,x,x]
			entry = entry.replace("[", "");
			entry = entry.replace("]", "");
			ArrayList<String> args = new ArrayList<String>();
			StringTokenizer st = new StringTokenizer(entry);
			String s = st.nextToken(",");
			while (!s.isEmpty()) {
				args.add(s);
				try {
					s = st.nextToken(",");
				} catch (Exception e) {
					s = "";
				}

			}
			for (int j = 0; j < pairSize; j++) {
				a[i][j] = Integer.valueOf(args.get(j));
				autList1.add(Integer.valueOf(args.get(j)));
			}
			i++;
		}

		// create niceListA
		niceListA = new ArrayList<ArrayList<Integer>>();
		for (int u = 0; u < pairSize; u++)
			niceListA.add(new ArrayList<Integer>());
		for (int k = 0; k < pairSize; k++)
			for (int j = 0; j < numPairs; j++) {
				autList2.add(a[j][k]);
			}
		for (int x = 0; x < pairSize; x++)
			for (int y = 0; y < numPairs; y++)
				niceListA.get(x).add(a[y][x]);
		// create niceListB
		niceListB = new ArrayList<ArrayList<Integer>>();
		for (int k = 0; k < numPairs; k++) {
			niceListB.add(new ArrayList<Integer>());
			for (int j = 0; j < pairSize; j++)
				niceListB.get(k).add(a[k][j]);
		}
		// clean autList2
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		for (Integer i : autList2) {
			if (i != 0 && !tempList.contains(i))
				tempList.add(i);
		}
		autList2 = new ArrayList<Integer>();
		autList2.addAll(tempList);

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
		if (option == 4)// draw on multiple circles split by the automorphism
						// group (1)
			drawOnMultipleCirclesByAutomorphism(nonOption, true);
		if (option == 5)// draw on multiple circles split by the automorphism
						// group (2)
			drawOnMultipleCirclesByAutomorphism(nonOption, false);
	}

	private static void drawOnMultipleCirclesByAutomorphism(int nonAutOption,
			boolean a) {
		ab = a;

		usedList = (ab) ? autList2 : autList1;
		nonAutList = new ArrayList<Integer>();
		for (int i = 0; i < numNodes; i++) {
			if (usedList.contains(i + 1)) {
				addNode(getMultipleX(i + 1, usedList, ab),
						getMultipleY(i + 1, usedList, ab), i);
			} else
				nonAutList.add(i);
		}
		if (nonAutOption == 0)// draw nodes on circle in the middle
			for (int j = 0; j < numNodes; j++)
				if (nonAutList.contains(j)) {
					addNode(getNonAutCricleX(j, nonAutList),
							getNonAutCricleY(j, nonAutList), j);
				}

		// flip the nodes to obtain true symmetry
		// Modify circles with i > numOfCircle/2+1

		flip(ab, usedList);

		// draw the edges
		drawEdges();
	}

	private static void drawOnCircleByAutomorphism(int nonAutOption, boolean a) {
		// draw the nodes
		usedList = (a) ? autList1 : autList2;
		System.out.println(usedList);
		System.out.println("NUM PAIRS: " + numPairs);
		System.out.println("PAIR SIZE: " + pairSize);
		if (!a){
			int aux = numPairs;
			numPairs = pairSize;
			pairSize = aux;
		}
		nonAutList = new ArrayList<Integer>();
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
		if (!a){
			int aux = numPairs;
			numPairs = pairSize;
			pairSize = aux;
		}
		drawEdges();
	}

	private static void flip(boolean a, ArrayList<Integer> usedList) {
		int numCircles = 0;
		int numPerCircle = 0;
		int myCircle = 1;
		if (a) {
			numCircles = pairSize;
			numPerCircle = numPairs;
		} else {
			numCircles = numPairs;
			numPerCircle = pairSize;
		}
		ArrayList<Integer> circle = new ArrayList<Integer>();
		for (int i = 0; i < usedList.size(); i++) {

			circle.add(usedList.get(i));
			if ((i + 1) % numPerCircle == 0)// circle is complete
			{
				if (myCircle > numCircles / 2 + 1) {
					rearangeCircle(circle);
				}
				myCircle++;
				circle = new ArrayList<Integer>();
			}

		}

	}

	public static void rearangeCircle(ArrayList<Integer> circle) {
		for (int i = 1; i <= circle.size() / 2; i++) {

			Node n1 = (Node) nodeLayer.getObjectByName(Integer.toString(circle
					.get(i) - 1));

			Node n2 = (Node) nodeLayer.getObjectByName(Integer.toString(circle
					.get(circle.size() - i) - 1));

			swapNodes(n1, n2);
		}

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

		return (int) (circleCentreX + vSize * Math
				.cos((2 * Math.PI * circleIndex / numCircles) + onCircleIndex
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
		return (int) (circleCentreY + vSize * Math
				.sin((2 * Math.PI * circleIndex / numCircles) + onCircleIndex
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

	private static int getNonAutCricleY(int j, ArrayList<Integer> bList) {
		return (int) (224 + 50 * Math.sin(bList.indexOf(j)
				* (2 * Math.PI / bList.size())));
	}

	private static int getNonAutCricleX(int j, ArrayList<Integer> bList) {
		return (int) (386 + 50 * Math.cos(bList.indexOf(j)
				* (2 * Math.PI / bList.size())));
	}

	private static int getAutCricleY(int i, ArrayList<Integer> usedList) {
		int index = usedList.indexOf(i);
		return (int) (224 + 210 * Math.sin((index - index % pairSize + index% pairSize*clusterDistance) * (2 * Math.PI / usedList.size())));
	}

	private static int getAutCricleX(int i, ArrayList<Integer> usedList) {
		int index = usedList.indexOf(i);
		return (int) (386 + 210 * Math.cos((index - index % pairSize + index % pairSize * clusterDistance)* (2 * Math.PI / usedList.size())));
	}

	private static void drawRandomlyOnCircle(int numNodes) {
		// draw the nodes
		ArrayList<Integer> randomArray = new ArrayList<Integer>();
		for (int i = 0; i < numNodes; i++)
			randomArray.add(0);
		for (int i = 0; i < numNodes; i++) {
			// determine random position, make sure no collisions
			int random = randomGenerator(0, numNodes - 1);
			while (randomArray.get(random) == 1) {
				random = randomGenerator(0, numNodes - 1);
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

	private static void swapNodes(GraphicsObject node1, GraphicsObject node2) {
		Node n1 = (Node) node1;
		Node n2 = (Node) node2;

		int auxX = node1.getX();
		int auxY = node1.getY();

		node1.setX(node2.getX());
		node1.setY(node2.getY());

		node2.setX(auxX);
		node2.setY(auxY);

		auxX = n1.getLabel().getX();
		auxY = n1.getLabel().getY();

		n1.getLabel().setX(n2.getLabel().getX());
		n1.getLabel().setY(n2.getLabel().getY());

		n2.getLabel().setX(auxX);
		n2.getLabel().setY(auxY);

		drawEdges();
	}

	private static void drawEdges() {
		lineLayer.removeAll();
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
	public void processImport(File file) {
		lastFile = file;
		try {
			FileInputStream fis = new FileInputStream(file);
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
			String[] entries = builder.toString().replace("\r", "").split("\n");
			for (String entry : entries) {
				wordList.add(entry);
			}
			setList(wordList);
			insertMultiple();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void f() {
		flip(ab, usedList);
	}

	@Override
	public void reduceCrossings() {
		if (option == 0 || option == 1) {
			reduceCrossings(new ArrayList<GraphicsObject>());
		} else {
			// create list with nodes not in automorphism group generator
			ArrayList<GraphicsObject> nonAutNodes = new ArrayList<GraphicsObject>();
			for (GraphicsObject node : nodeLayer.children)
				if (nonAutList.contains(Integer.valueOf(node.name)))
					nonAutNodes.add((Node) node);
			reduceCrossings(nonAutNodes);
		}
	}

	private int computeCrossings() {
		int sum = 0;
		for (GraphicsObject line1 : lineLayer.children)
			for (GraphicsObject line2 : lineLayer.children)
				if (!line1.equals(line2)
						&& doIntersect((LabeledLine) line1, (LabeledLine) line2))
					sum++;
		return sum / 2;
	}

	private void reduceCrossings(ArrayList<GraphicsObject> nodes) {
		if (nodes.size() == 0)
			nodes = nodeLayer.children;
		// I need to find the 2 nodes that will reduce the number of crossing by
		// the maximum possible value.
		// For this I need: a method that gives me the number of crossings at a
		// particular setting, a method that swaps 2 nodes
		// a method that returns if 2 edges cross
		int initialCrossings = computeCrossings();
		int afterCrossings = 0;
		int bestDifference = 0;
		Node bestNode1 = null;
		Node bestNode2 = null;
		for (GraphicsObject node1 : nodes)
			for (GraphicsObject node2 : nodes) {
				if (!node1.equals(node2)) {
					swapNodes(node1, node2);
					afterCrossings = computeCrossings();
					if (initialCrossings - afterCrossings > bestDifference) {
						bestDifference = initialCrossings - afterCrossings;
						bestNode1 = (Node) node1;
						bestNode2 = (Node) node2;
					}
					swapNodes(node1, node2);
				}
			}

		if (bestDifference > 0) {
			swapNodes(bestNode1, bestNode2);
		}

	}

	private boolean doIntersect(LabeledLine l1, LabeledLine l2) {
		Point p1 = new Point(l1.getX(), l1.getY());
		Point q1 = new Point(l1.getX2(), l1.getY2());
		Point p2 = new Point(l2.getX(), l2.getY());
		Point q2 = new Point(l2.getX2(), l2.getY2());
		if (p1.equals(p2) || p1.equals(q2) || q1.equals(p2) || q1.equals(q2))
			return false;
		int o1 = orientation(p1, q1, p2);
		int o2 = orientation(p1, q1, q2);
		int o3 = orientation(p2, q2, p1);
		int o4 = orientation(p2, q2, q1);
		if (o1 != o2 && o3 != o4)
			return true;
		if (o1 == 0 && onSegment(p1, p2, q1))
			return true;
		if (o2 == 0 && onSegment(p1, q2, q1))
			return true;
		if (o3 == 0 && onSegment(p2, p1, q2))
			return true;
		if (o4 == 0 && onSegment(p2, q1, q2))
			return true;
		return false;
	}

	private boolean onSegment(Point p, Point q, Point r) {
		return (q.x <= Math.max(p.x, r.x) && q.x >= Math.min(p.x, r.x)
				&& q.y <= Math.max(p.y, r.y) && q.y >= Math.min(p.y, r.y));
	}

	private int orientation(Point p, Point q, Point r) {
		int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);
		if (val == 0)
			return 0;// colinear
		return (val > 0) ? 1 : 2;// clockwise or counterclockwise
	}

	@Override
	public void reduceSumOfEdges() {
		if (option == 0 || option == 1) {
			reduceSumRandom();
		}
	}

	private void reduceSumRandom() {
		int initialSum = computeSum();
		int afterSum = 0;
		int bestDifference = 0;
		Node bestNode1 = null;
		Node bestNode2 = null;
		for (GraphicsObject node1 : nodeLayer.children)
			for (GraphicsObject node2 : nodeLayer.children) {
				if (!node1.equals(node2)) {
					swapNodes(node1, node2);
					afterSum = computeSum();
					if (initialSum - afterSum > bestDifference) {
						bestDifference = initialSum - afterSum;
						bestNode1 = (Node) node1;
						bestNode2 = (Node) node2;
					}
					swapNodes(node1, node2);
				}
			}
		if (bestDifference > 0) {
			swapNodes(bestNode1, bestNode2);
		}
	}

	private int computeSum() {
		int sum = 0;
		for (GraphicsObject line : lineLayer.children) {
			LabeledLine l = (LabeledLine) line;
			sum += Math.sqrt(Math.pow(l.getX() - l.getX2(), 2)
					+ Math.pow(l.getY() - l.getY2(), 2));
		}
		return sum;
	}

	public void setLastFile(File f) {
		lastFile = f;
	}

	public File getLastFile() {
		return lastFile;
	}

	@Override
	public void saveImage() {
		BufferedImage image = new BufferedImage(800, 500,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		int r = 255;
		int g1 = 255;
		int b = 255;
		int col = (r << 16) | (g1 << 8) | b;
		//background
		for (int i = 0; i < 800; i++)
			for (int j = 0; j < 500; j++)
				image.setRGB(i, j, col);

		g.setColor(Color.BLACK);
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,
				RenderingHints.VALUE_FRACTIONALMETRICS_ON);

		for (GraphicsObject go : lineLayer.children) {
			LabeledLine ll = (LabeledLine) go;

			g.drawLine(ll.getX(), ll.getY(), ll.getX2(), ll.getY2());
		}
		
		for (GraphicsObject go : nodeLayer.children) {
			g.setColor(Color.WHITE);
			g.fillOval(go.x, go.y, 12, 12);
			g.setColor(Color.BLACK);
			g.drawOval(go.x, go.y, 12, 12);
		}

		g.setColor(Color.BLACK);
		g.setFont(Window.getFeltTip().deriveFont((float)11.0).deriveFont(Font.BOLD));

		for (GraphicsObject go : nodeLayer.children) {

			CenteredLabel cl = ((Node) go).getLabel();
			GlyphVector gv = g.getFont().createGlyphVector(
					((Graphics2D) g).getFontRenderContext(), cl.text);
			java.awt.Rectangle r1 = gv.getPixelBounds(null, cl.x, cl.y);
			g.drawString(cl.text, cl.x - r1.width / 2, cl.y);
		}

		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File f = fc.getSelectedFile();
				if (!f.getAbsolutePath().endsWith(".jpg") && !f.getAbsolutePath().endsWith(".jpeg"))
					f = new File(f.getAbsolutePath() + ".jpeg");
				ImageIO.write(image, "jpg", f);
		}} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setVSize(int i) {
		vSize = i;
		
	}

	@Override
	public void setClusterDistance(double d) {
		clusterDistance = d;
		
	}
}