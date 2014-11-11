package graphics;

public class ActiveLine extends Line {
	private boolean active = true;
	private int spawnState = -1;

	public ActiveLine(int _x1, int _y1, float thickness) {
		super(_x1, _y1, _x1, _y1, thickness);
	}

	@Override
	public void handleLeftMouse(int mx, int my, boolean down) {
		if (down)
			return;
		spawnState++;
		if (spawnState == 1)
			active = false;
	}

	@Override
	public void handleMouse(int mx, int my) {
		if (!active)
			return;
		x2 = mx - parent.getLocationOnScreen().x;
		y2 = my - parent.getLocationOnScreen().y;
	}
}
