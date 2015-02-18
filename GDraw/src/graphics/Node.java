package graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

public class Node extends GraphicsObject {

	public CenteredLabel label;
	private ArrayList<Node> neighbours;
	public ArrayList<Node> pathToRoot;
	private int halfNodeSize;

	public Node(int _x, int _y, String _name) {
		x = _x;
		y = _y;
		halfNodeSize = 6;
		this.name = _name;

		label = new CenteredLabel(_x + halfNodeSize - 1, _y + halfNodeSize + 3,
				Integer.toString((Integer.parseInt(_name) + 1)), 10);
		alpha = 255;

		outlineAlpha = 30;
		neighbours = new ArrayList<Node>();
	}

	@Override
	public void draw(Graphics2D g) {
		Color c = setColourTransparency(backgroundIdle, alpha);
		g.setPaint(c);
		g.setColor(Color.WHITE);
		g.fillOval(x, y, 2 * halfNodeSize, 2 * halfNodeSize); // Fill
		// g.setColor(setColourTransparency(borderIdle, outlineAlpha)); // Black
		g.setColor(Color.BLACK); // outline
		g.drawOval(x, y, 2 * halfNodeSize, 2 * halfNodeSize); // Outline
		label.draw(g);
	}

	@Override
	public void handleMouse(int mx, int my) {
		Point loc = new Point(mx - halfNodeSize, my - halfNodeSize);
		Point loc2 = parent.getLocation(this);
		boolean hasHover = loc.distance(loc2) <= 50;
		if (hover != hasHover)
			parent.repaint();
		hover = hasHover;
	}

	@Override
	public void setAlpha(int a) {
	}

	public int getXCenter() {
		return x + halfNodeSize;
	}

	public CenteredLabel getLabel() {
		return label;
	}

	public int getHalfSize() {
		return halfNodeSize;
	}

	public int getYCenter() {
		return y + halfNodeSize;
	}

	public void addNeighbour(Node n) {
		neighbours.add(n);
	}

	public ArrayList<Node> getNeighbours() {
		return neighbours;
	}

	public int getX() {
		return x;
	}
}
