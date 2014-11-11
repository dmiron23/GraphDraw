package graphics;

import java.awt.Graphics2D;
import java.awt.Point;

public class SortBox extends BoxedText {

	/* Instance Variables */

	private Point p; // position of text
	private Label chars; // single collection of values rather than multiple
	private int actualValue = -1;
	private int rank = 0; // use for actual and intended position
	private boolean pivot = false;

	/* Constructor */

	public SortBox(int _x, int _y, int _width, int _height, String _text) {
		super(_x, (500 - _y), _width, _height, _text); // invert y coordinate to
														// make it easier to
														// resize
		p = new Point(x, y + height / 2 - 10); // centre point of text - not
												// used when generating, use
												// rect.draw
		chars = new Label(p.x, p.y, "0");
	}

	/* Methods */

	private String pad(String i, int n, String p) {
		while (i.length() < n)
			i = p + i;
		return i;
	}

	private String pad(int i, int n, String p) {
		String r = String.valueOf(i);
		while (r.length() < n)
			r = p + r;
		return r;
	}

	@Override
	public void draw(Graphics2D g) {
		p = new Point(x, y + 10); // change centre point of text, leads left
									// from centre
		rect.x = x;
		rect.y = y;
		chars.x = p.x;
		chars.y = p.y;
		rect.draw(g);
		g.setColor(setColourTransparency(foregroundIdle, alpha));
		chars.draw(g);
	}

	/* Getters and Setters */

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public boolean getPivot() {
		return pivot;
	}

	public void setPivot(boolean pivot) {
		this.pivot = pivot;
	}

	public boolean isPivot() { // tidy up
		return getPivot();
	}

	public int getActualValue() {
		return actualValue;
	}

	public void setActualValue(int value) {
		this.actualValue = value;
	}

	public void setLabel(int l, int n, String s) {
		char[] c = pad(pad(l, n, s), 4, " ").toCharArray();
		chars.alpha = 0;
		chars.text = String.valueOf(c); // problem here
		chars.alpha = 255;
		actualValue = l;
	}

	public Label getChars() {
		return chars;
	}

	@Override
	public void setAlpha(int alpha) {
		getRect().alpha = alpha;
		getRect().outlineAlpha = alpha;
		getChars().alpha = alpha;
	}
}
