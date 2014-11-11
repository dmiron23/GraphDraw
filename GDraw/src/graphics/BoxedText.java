package graphics;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

public class BoxedText extends GraphicsObject {
	protected Label label;
	protected Rectangle rect;

	public BoxedText(int _x, int _y, int _width, int _height, String _text) {
		x = _x;
		y = _y;

		width = _width;
		height = _height;
		rect = new Rectangle(_x, _y, _width, _height);
		label = new Label(_x, _y, _text);
		alpha = 255;
		outlineAlpha = 50;
	}

	@Override
	public void draw(Graphics2D g) {

		rect.x = x;
		rect.y = y;

		Rectangle2D sBounds = g.getFontMetrics().getStringBounds(label.text, g);
		label.x = (int) (rect.x + rect.width / 2 - sBounds.getWidth() / 2);
		label.y = (int) (rect.y + rect.height / 2 - sBounds.getHeight() / 2);

		rect.draw(g);
		label.draw(g);
	}

	@Override
	public void handleMouse(int mx, int my) {
		Point loc = parent.getLocation(this);
		boolean hasHover = (mx >= loc.x && mx <= loc.x + width && my >= loc.y && my <= loc.y
				+ height);
		if (hover != hasHover) {
			parent.repaint();
		}
		hover = hasHover;
		rect.handleMouse(mx, my);
	}

	@Override
	public void setAlpha(int a) {
		alpha = a;
		rect.alpha = a;
		label.alpha = a;
	}

	public Rectangle getRect() {
		return rect;
	}

	public Label getLabel() {
		return label;
	}
}