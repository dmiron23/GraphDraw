package graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

public class Node extends GraphicsObject {

	//public CenteredLabel distance;
	private ArrayList<Node> neighbours;
	public ArrayList<Node> pathToRoot;

	public Node(int _x, int _y) {
		x = _x;
		y = _y;

		
		//distance = new CenteredLabel(_x, _y-10, "?",10);
		alpha = 255;	

		outlineAlpha = 30;
		neighbours = new ArrayList<Node>();
	}

	@Override
	public void draw(Graphics2D g) {
		Color c = setColourTransparency(backgroundIdle, alpha);
		g.setPaint(c);
		g.fillOval(x, y, 4, 4); // Fill
		g.setColor(setColourTransparency(borderIdle, outlineAlpha)); // Black
																		// outline
		g.drawOval(x, y, 4, 4); // Outline
		//distance.draw(g);
	}

	@Override
	public void handleMouse(int mx, int my) {
		Point loc = new Point(mx - 2, my - 2);
		Point loc2 = parent.getLocation(this);
		boolean hasHover = loc.distance(loc2) <= 50;
		if (hover != hasHover){
			parent.repaint();
			System.out.println(Integer.valueOf(this.name)+1);}
		hover = hasHover;
	}

	@Override
	public void setAlpha(int a) {
		// TODO Auto-generated method stub

	}

	public int getXCenter() {
		return x + 2;
	}

	public int getYCenter() {
		return y + 2;
	}

	public void addNeighbour(Node n) {
		neighbours.add(n);
	}

	public ArrayList<Node> getNeighbours() {
		return neighbours;
	}
}
