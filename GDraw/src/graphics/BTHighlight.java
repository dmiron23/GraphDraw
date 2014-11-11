package graphics;

import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

public class BTHighlight extends BoxedText {

	Point p;
	private final int capacity = 4;
	private ArrayList<Label> chars = new ArrayList<Label>();
	private int actualValue = -1;

	public BTHighlight(int _x, int _y, int _width, int _height, String _text) {
		super(_x, _y, _width, _height, _text);

		p = new Point(x + width / 2 + 15, y + height / 2 - 10);
		for (int i = 0; i < capacity; i++)
			chars.add(new Label(p.x - capacity * 8 + 8 * i, p.y, "0"));
	}

	public ArrayList<Label> getChars() {
		return chars;
	}

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

	public void setActualValue(int value) {
		this.actualValue = value;
	}

	public void setLabel(int l, int n, String s) {
		char[] c = pad(pad(l, n, s), 4, " ").toCharArray();
		for (Label cs : chars)
			cs.alpha = 0;
		for (int i = 0; i < c.length; i++) {
			int ind = capacity - i - 1;
			chars.get(ind).text = String.valueOf(c[ind]);
			chars.get(ind).alpha = 255;
		}
		actualValue = l;
	}

	public int getActualValue() {
		return actualValue;
	}

	@Override
	public void setAlpha(int alpha) {
		getRect().alpha = alpha;
		getRect().outlineAlpha = Math.min(50, alpha);
		for (Label l : getChars())
			l.alpha = alpha;
	}

	@Override
	public void draw(Graphics2D g) {

		p = new Point(x + width / 2 + 15, y + height / 2 - 10);
		rect.x = x;
		rect.y = y;
		for (int i = 0; i < capacity; i++) {
			chars.get(i).x = x - capacity * 8 + 8 * i + 45;
			chars.get(i).y = p.y;
		}

		// update chars yourself lol

		rect.draw(g);

		g.setColor(setColourTransparency(foregroundIdle, alpha));

		for (Label l : chars)
			l.draw(g);
	}

}
