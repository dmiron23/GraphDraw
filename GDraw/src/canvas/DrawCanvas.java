package canvas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import graphics.ActiveLine;
import graphics.CenteredLabel;
import graphics.GraphicsObject;
import graphics.Label;
import graphics.LabeledLine;
import graphics.Layer;
import graphics.Line;
import graphics.Node;
import graphics.Rectangle;

@SuppressWarnings("serial")
public class DrawCanvas extends JPanel implements MouseMotionListener,
		MouseListener {
	public static Font f = new Font(Font.MONOSPACED, 0, 14);
	// Draw list, objects at the end appear in front of preceding objects.
	public static ArrayList<GraphicsObject> objects = new ArrayList<GraphicsObject>();
	private AnimationControl ac;
	Point mousePosition = new Point();

	// Below are wrapped constructors to:
	// Create objects.
	// Add them to drawing list at draw order 0 (Appears over older objects).
	// Set the "parent" property to this.
	// Return them for assignment purposes.

	public DrawCanvas() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void setAnimationControl(AnimationControl _ac) {
		ac = _ac;
	}

	public ActiveLine createActiveLine(int _x, int _y, float thickness) {
		ActiveLine al = new ActiveLine(_x, _y, thickness);
		al.parent = this;
		objects.add(al);
		return al;
	}

	public Line createLine(int _x, int _y, int _x2, int _y2, float thickness) {
		Line l = new Line(_x, _y, _x2, _y2, thickness);
		l.parent = this;
		objects.add(l);
		return l;
	}

	public LabeledLine createLabeledLine(int _x, int _y, int _x2, int _y2, float thickness, String _text, int _fontSize) {
		LabeledLine l = new LabeledLine(_x, _y, _x2, _y2, thickness, _text, _fontSize);
		l.parent = this;
		objects.add(l);
		return l;
	}

	public CenteredLabel createCenteredLabel(int _x, int _y, String _text, int _fontSize) {
		CenteredLabel l = new CenteredLabel(_x, _y, _text,_fontSize);
		l.parent = this;
		objects.add(l);
		return l;
	}

	public Label createLabel(int _x, int _y, String _text) {
		Label l = new Label(_x, _y, _text);
		l.parent = this;
		objects.add(l);
		return l;
	}

	public Rectangle createRect(int _x, int _y, int _width, int _height) {
		Rectangle r = new Rectangle(_x, _y, _width, _height);
		r.parent = this;
		objects.add(r);
		return r;
	}


	
	public Node createNode(int _x, int _y, String _name) {
		Node n = new Node(_x, _y, _name);
		n.parent = this;
		objects.add(n);
		return n;
	}


	public Layer createLayer() {
		Layer l = new Layer();
		l.parent = this;
		objects.add(l);
		return l;
	}

	@Override
	public void paintComponent(Graphics g) {
		// Routine to draw objects to screen.
		Graphics2D g2d = (Graphics2D) g; // Cast Graphics to Graphics2D for
										 // convenience.
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON); // Enable antialiasing.
		g2d.clearRect(0, 0, this.getWidth(), this.getHeight()); // Clear canvas.
		g2d.setColor(new Color(238, 238, 238));
		g2d.fillRect(0,0, this.getWidth(), this.getHeight());
		g.setFont(f);
		for (GraphicsObject go : DrawCanvas.objects)
			drawGraphicsObject(g2d, go);
		
	}

	public static void drawGraphicsObject(Graphics2D g, GraphicsObject go) {
		g.setStroke(new BasicStroke(go.lineThickness));
		go.draw(g);
		g.setStroke(new BasicStroke(1));
		g.setColor(Color.BLACK);
	}

	public void removeObject(GraphicsObject go) { // Remove an object from the
				      							  // canvas.
		objects.remove(go);
	}

	public void removeAll() { // Remove all objects from the canvas.
		objects = new ArrayList<GraphicsObject>();
	}

	public GraphicsObject getObjectByName(String name) {
		for (GraphicsObject go : DrawCanvas.objects)
			if (go.name != null)
				if (go.name.equals(name))
					return go;
		return null;
	}

	public void updateCanvas() {
		revalidate();
		repaint();
	}

	public void tick() {
		for (GraphicsObject go : DrawCanvas.objects)
			tickObject(go);
	}

	public static void tickObject(GraphicsObject go) {
		if (go.tween != null) {
			go.setAlpha(go.tween.getAlpha());
			Point newPos = new Point(0, 0);
			if (go.tween.tweenMode == 0)
				newPos = go.tween.getNextPoint();
			else if (go.tween.tweenMode == 1)
				newPos = go.tween.getEasedPoint();
			go.x = newPos.x;
			go.y = newPos.y;
			go.refresh();
		}
		go.tick();
	}

	public Point getLocation(GraphicsObject go) { // Used to provide the
												  // absolute position of a
												  // child.
		Point p = getLocationOnScreen(); // Get the absolute position of this.
		p.translate(go.x, go.y); // Offset it by the child position.
		return p; // Return the position.
	}

	@Override
	public void mouseMoved(MouseEvent e) { // Whenever the mouse is moved...
		mousePosition.x = e.getLocationOnScreen().x - getLocationOnScreen().x;
		mousePosition.y = e.getLocationOnScreen().y - getLocationOnScreen().y;
		for (GraphicsObject go : DrawCanvas.objects) { // For each GraphicsObject...
			if(go.mouseEnabled)
			go.handleMouse(e.getXOnScreen(), e.getYOnScreen()); 
		}
		ac.handleMouseMove(e.getX(), e.getY());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		mouseMoved(e);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent e) {
		for (GraphicsObject go : DrawCanvas.objects)
			if(go.mouseEnabled)
			go.handleLeftMouse(e.getXOnScreen(), e.getYOnScreen(), true);
		if (e.getButton() == 1) // Left click
			ac.handleMouse(e.getX(), e.getY());
		else
			// Middle/Right
			ac.handleAltMouse(e.getX(), e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		for (GraphicsObject go : DrawCanvas.objects)
			if(go.mouseEnabled)
			go.handleLeftMouse(e.getXOnScreen(), e.getYOnScreen(), false);
	}

	
}
