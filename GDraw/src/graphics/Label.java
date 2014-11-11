package graphics;

import java.awt.Font;
import java.awt.Graphics2D;

public class Label extends GraphicsObject {
	public String text;
	private int fontSize=14;

	public Label(int _x, int _y, String _text) {
		x = _x;
		y = _y;
		text = _text;
		alpha = 255;
	}

	public void setFontSize(int _fontSize){
		fontSize = _fontSize;
	}
	@Override
	public void draw(Graphics2D g) {
		g.setColor(setColourTransparency(foregroundIdle, alpha));
		g.setFont(new Font(g.getFont().getName(), g.getFont().getStyle(), fontSize));
		g.drawString(text, x, y + g.getFontMetrics().getHeight());
	}

	@Override
	public void handleMouse(int mx, int my) {
	}

	@Override
	public void setAlpha(int a) {
		alpha = a;
	}
}
