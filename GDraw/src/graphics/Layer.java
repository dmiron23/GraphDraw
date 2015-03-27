package graphics;

import java.awt.Graphics2D;
import java.util.ArrayList;

import canvas.DrawCanvas;

public class Layer extends GraphicsObject {
	public ArrayList<GraphicsObject> children = new ArrayList<GraphicsObject>();

	public void addChild(GraphicsObject go) {
		DrawCanvas.objects.remove(go);
		children.add(go);
	}

	@Override
	public void draw(Graphics2D g) {
		for (GraphicsObject go : children)
			DrawCanvas.drawGraphicsObject(g, go);
	}

	public void removeChild(GraphicsObject go) {
		children.remove(go);
	}

	@Override
	public void handleMouse(int mx, int my) {
		for (GraphicsObject go : children)
			go.handleMouse(mx, my);
	}

	@Override
	public void handleLeftMouse(int mx, int my, boolean down) {
		for (GraphicsObject go : children)
			go.handleLeftMouse(mx, my, down);
	}

	public void removeAll() {
		children = new ArrayList<GraphicsObject>();
	}

	@Override
	public void setAlpha(int a) {
	}

	@Override
	public void tick() {
		for (GraphicsObject go : children)
			DrawCanvas.tickObject(go);
	}

	public GraphicsObject getObjectByName(String name) {
		for (GraphicsObject go : children)
			if (go.name != null)
				if (go.name.equals(name))
					return go;
		return null;
	}
}
