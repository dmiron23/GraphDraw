package graphics;

import java.awt.Graphics2D;
import java.awt.Point;

public class HoverCircle extends Circle {

	public HoverCircle(int _x, int _y, int _diameter) {
		super(_x, _y, _diameter);
	}

	@Override
	public void draw(Graphics2D g) {
		g.setPaint(setColourTransparency(
				setColourTransparency(backgroundActive, 50), 50));
		if (hover)
			g.fillOval(x - diameter / 2, y - diameter / 2, diameter, diameter); // Fill
	}

	@Override
	public void handleMouse(int mx, int my) {
		Point loc = new Point(mx, my);
		Point loc2 = parent.getLocation(this);
		boolean hasHover = loc.distance(loc2) <= diameter / 2;
		if (hover != hasHover)
			parent.repaint();
		hover = hasHover;
	}

}
