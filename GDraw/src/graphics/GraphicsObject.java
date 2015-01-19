package graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import canvas.canvas;
import graphics.TweenClass.Tween;

public abstract class GraphicsObject{
	// Some basic properties that will apply to all graphics objects.
	public int x;
	public int y;
	public int width;
	public int height;
	public int alpha; // Opacity, 0-255
	public int outlineAlpha; // Opacity, 0-255
	public int lineThickness = 1;
	public boolean hover;
	public canvas parent;
	public Tween tween;
	public String name;
	public Object data;
	public boolean mouseEnabled = true;
	
	// All objects need to call draw to actually be shown.
	public abstract void draw(Graphics2D g);

	public abstract void handleMouse(int mx, int my);

	public abstract void setAlpha(int a);

	public Tween tweenTo(int _x, int _y, int _sa, int _ea, int divisor,
			int tweenMode) {
		tween = new Tween(new Point(x, y), new Point(_x, _y), _sa, _ea,
				divisor, tweenMode);
		tween.go = this;
		return tween;
	}

	public void swapDepth(GraphicsObject other) {
		int i = canvas.objects.indexOf(this);
		int oi = canvas.objects.indexOf(other);
		canvas.objects.set(oi, this);
		canvas.objects.set(i, other);
	}

	public void bringToFront() {
		canvas.objects.remove(this);
		canvas.objects.add(this);
	}

	public void sendToBack() {
		canvas.objects.remove(this);
		canvas.objects.add(0, this);
	}

	public Color setColourTransparency(Color _c, int alpha) {
		return new Color(_c.getRed(), _c.getGreen(), _c.getBlue(), alpha);
	}

	public Color darken(Color _c, int amount) {
		return new Color(Math.max(0, _c.getRed() - amount), Math.max(0,
				_c.getGreen() - amount), Math.max(0, _c.getBlue() - amount),
				alpha);
	}

	public Color lighten(Color _c, int amount) {
		return new Color(Math.min(255, _c.getRed() + amount), Math.min(255,
				_c.getGreen() + amount), Math.min(255, _c.getBlue() + amount),
				alpha);
	}

	public void setName(String _name) {
		name = _name;
	}

	public String getName() {
		return name;
	}

	public Color backgroundIdle = new Color(169, 232, 238);
	public Color backgroundActive = new Color(144, 203, 209);

	public Color borderIdle = new Color(0, 0, 0);
	public Color borderActive = new Color(0, 0, 0);

	public Color foregroundIdle = new Color(0, 0, 0);
	public Color foregroundActive = new Color(0, 0, 0);

	public void handleLeftMouse(int mx, int my, boolean down) {
	}
	public void refresh() {
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getY() {
		return y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void tick() {
	}
}