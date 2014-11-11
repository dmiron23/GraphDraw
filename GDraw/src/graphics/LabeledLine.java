package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class LabeledLine extends Line {
	public CenteredLabel label;
	private double angle;
	private int xOffset;
	private int yOffset;
	public LabeledLine(int _x1, int _y1, int _x2, int _y2, float _thickness, String l, int _fontSize) {
		super(_x1, _y1, _x2, _y2, _thickness);
		xOffset = _x2-_x1;
		yOffset = _y2-_y1;
		lineThickness = (int)_thickness;
		//label = new CenteredLabel((int)((_x1 + _x2)/2), (int)((_y1 + _y2)/2), l, _fontSize);
		angle = Math.atan2(_y2-_y1, _x2 - _x1);	
		if(angle < -Math.PI/2 || angle > Math.PI/2) angle += Math.PI;
		refresh();
	}
	@Override
	public void draw(Graphics2D g) {
		Color c = setColourTransparency(foregroundIdle, outlineAlpha);
		if (hover)
			c = lighten(c, 40);
		g.setColor(c);
		s  = new BasicStroke(lineThickness,
                BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND);
		g.setStroke(s);
		g.drawLine(x, y, x + xOffset, y + yOffset);
		//g.setStroke(new BasicStroke(1.0f));
		//g.rotate(angle, label.x, label.y);
		//label.draw(g);
		//g.rotate(-angle, label.x, label.y);
	}
	@Override
	public void refresh() {
		x2 = x + xOffset;
		y2 = y + yOffset;
		//label.x = (int)((x + x2) / 2 + Math.cos(angle - Math.PI / 2) * (10 + lineThickness));
		//label.y = (int)((y + y2) / 2 + Math.sin(angle - Math.PI / 2) * (10 + lineThickness));
	}
	
}
