package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;

public class Line extends GraphicsObject {

	protected int x2;
	protected int y2;

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	Stroke s;

	public Line(int _x1, int _y1, int _x2, int _y2, float thickness) {
		x = _x1;
		y = _y1;
		x2 = _x2;
		y2 = _y2;

		outlineAlpha = 255;

		s = new BasicStroke(thickness, BasicStroke.CAP_ROUND,
				BasicStroke.JOIN_ROUND);
	}

	public Point startPoint() {
		return new Point(x, y);
	}

	public Point endPoint() {
		return new Point(x2, y2);
	}

	public void setStartPoint(int _x, int _y) {
		x = _x;
		y = _y;
	}

	public void setEndPoint(int _x, int _y) {
		x2 = _x;
		y2 = _y;
	}

	@Override
	public void draw(Graphics2D g) {
		Color c = setColourTransparency(foregroundIdle, outlineAlpha);
		if (hover)
			c = lighten(c, 40);
		g.setColor(c);
		g.setStroke(s);
		g.drawLine(x, y, x2, y2);
		g.setStroke(new BasicStroke(1.0f));

		// Outline

	}

	@Override
	public void handleMouse(int mx, int my) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAlpha(int a) {

	}

}
