package canvas;

import graphics.TweenClass.TweenEvent;
import graphics.TweenClass.TweenListener;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.Timer;

public abstract class AnimationControl implements ActionListener, TweenListener {
	protected static canvas c;
	protected Object returnObj;
	protected DelayThread dT;
	protected Timer t = new Timer(1000 / 60, this);
	protected JTextArea pseudo;
	protected int speed = 1;
	public int stateFlag = 0;
	public Point mousePosition = new Point();
	public static JFrame form;

	public AnimationControl(canvas _c, JTextArea _pseudo) {
		c = _c;
		pseudo = _pseudo;
	}

	public void actionPerformed(ActionEvent e) {
		tick();
		c.tick();
	}

	public abstract void tick();

	public abstract void startAnimation();

	public abstract void tweenCompleted(TweenEvent event);

	public abstract void processExport();

	public abstract void setList(ArrayList<String> wordList);

	public abstract void insertMultiple();
	
	public void export(){}

	public void handleMouse(int x, int y) {}

	public void handleAltMouse(int x, int y) {}

	public void setSpeed(int s) {
		speed = s;
	}

	public abstract boolean isIdle();

	public int getSpeed() {
		return speed;
	}

	public void kill() {
		t.stop(); // Goodbye, cruel world.
	}

	public void handleMouseMove(int x, int y) {}
	
	public abstract String getTitle();

	public abstract void processClear();

	public abstract void setNonAutOption(int i);
	
	public abstract void setAutOption(int i);
}
