package graphics;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Point;

public class Rectangle extends GraphicsObject {

	public Rectangle(int _x, int _y, int _width, int _height, int _alpha) {
		x = _x;
		y = _y;
		width = _width;
		height = _height;
		alpha = _alpha;
		outlineAlpha = 50;
	}

	public void draw(Graphics2D g) {
		g.setPaint(new Color(200,200,200, alpha));
		g.fillOval(x, y, 4, 4); // Fill
		g.setColor(setColourTransparency(borderIdle, outlineAlpha)); 
		
		g.setPaint(new Color(200,200,200));
		g.fillRoundRect(x, y, width, height, 15, 15); // Super nice.

		g.setColor(setColourTransparency(borderIdle, outlineAlpha));
		g.drawRoundRect(x, y, width, height, 15, 15);
		// Outline
		/*
		 * g.fill (r);
		 * g.setColor(setColourTransparency(borderIdle,outlineAlpha));
		 * g.drawRect(x, y, width, height);
		 */
	}

	@Override
	public void handleMouse(int mx, int my) {
		Point loc = parent.getLocation(this);
		boolean hasHover = (mx >= loc.x && mx <= loc.x + width && my >= loc.y && my <= loc.y
				+ height);
		if (hover != hasHover)
			parent.repaint();
		hover = hasHover;
	}

	@Override
	public void setAlpha(int a) {
		alpha = a;
	}

}
