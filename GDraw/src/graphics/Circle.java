package graphics;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circle extends GraphicsObject {
	protected int diameter;

	public Circle(int _x, int _y, int _diameter) {
		x = _x;
		y = _y;
		diameter = _diameter;
		alpha = 255;
	}

	@Override
	public void draw(Graphics2D g) {
		Color c = setColourTransparency(backgroundIdle, 0);
		g.setPaint(setColourTransparency(c, alpha));
		g.fillOval(x - diameter / 2, y - diameter / 2, diameter, diameter); // Fill
	}

	@Override
	public void setAlpha(int a) {
		alpha = a;
	}

	@Override
	public void handleMouse(int mx, int my) {
		// TODO Auto-generated method stub

	}

}
