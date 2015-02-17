package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.GlyphVector;

import canvas.canvas;

public class CenteredLabel extends Label {

	private Font f;
	public CenteredLabel(int _x, int _y, String _text, int _fontSize) {
		super(_x, _y, _text);
		f = new Font(canvas.f.getName(),Font.BOLD, 10);
		
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setFont(f);
		GlyphVector gv = g.getFont().createGlyphVector(g.getFontRenderContext(), text);
        java.awt.Rectangle r = gv.getPixelBounds(null, x, y);
        g.setColor(Color.BLACK);
		g.drawString(text, x - r.width/2, y);
	}
}
