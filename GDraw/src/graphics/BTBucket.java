package graphics;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class BTBucket extends BoxedText {
	public static ArrayList<BoxedText> bucketRects = new ArrayList<BoxedText>(); // Grid
																					// of
																					// boxedtexts
																					// on
																					// right,
																					// represents
																					// buckets.

	public BTBucket(int _x, int _y, int _width, int _height, String _text) {
		super(_x, _y, _width, _height, _text);
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
		for (int i = 0; i < bucketRects.size(); i++)
			bucketRects.get(i).draw(g);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void handleMouse(int mx, int my) {
		Point loc = parent.getLocation(this);
		boolean hasHover = (mx >= loc.x + 4 && mx <= loc.x + width - 4
				&& my >= loc.y + 4 && my <= loc.y + height - 4);
		if (hover != hasHover) {
			ArrayList<String> contents = (ArrayList<String>) data;
			if (hasHover) {
				for (int i = 0; i < contents.size(); i++) {
					BoxedText bT = new BoxedText(100, 50 * i + 20, 200, 50,
							contents.get(i));
					bucketRects.add(bT);
				}
			} else {
				while (bucketRects.size() > 0)
					bucketRects.remove(0); // Baby don't hurt me.
				// No moooore.
			}
			parent.repaint();
		}
		hover = hasHover; // Silly goose
		label.handleMouse(mx, my);
		if (hover)
			rect.handleMouse(mx, my);
		else
			rect.handleMouse(x - 1, y - 1);
	}
}
