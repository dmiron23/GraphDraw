package canvas;

import graphics.TweenClass.TweenEvent;
import graphics.TweenClass.TweenListener;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;

import ControlsEx.TFRestrict;

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

	public void actionPerformed(ActionEvent e) { // Timer action, 60 times per
													// second.
		tick();
		c.tick();
	}

	public void highlightLine(int[] lines) {
		int counter = 0;
		pseudo.getHighlighter().removeAllHighlights();
		int startIndex = 0;
		for (int line : lines)
			while (++counter < line)
				startIndex = pseudo.getText().indexOf("\n", startIndex) + 1;

		DefaultHighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
		try {
			pseudo.getHighlighter().addHighlight(startIndex,
			pseudo.getText().indexOf("\n", startIndex), painter);
		} catch (BadLocationException e) {
		}

	}

	public void clearHighlight() {
		pseudo.getHighlighter().removeAllHighlights();
	}

	public abstract void tick();

	public abstract void startAnimation();

	public abstract void tweenCompleted(TweenEvent event);

	public abstract void processB1(String key);

	/*public abstract void processB2(String key);

	public abstract void processB3(String key);
	*/
	public abstract void processButton(String s, String k);

	public abstract void processMenu(String menuItem);

	public abstract void setList(ArrayList<String> wordList);

	public abstract void insertMultiple();
	
	public void export(){}

	public abstract void checkInput(TFRestrict t);

	public abstract void setupUI(ArrayList<JButton> buttons);

	public void handleMouse(int x, int y) {
	};

	public void handleAltMouse(int x, int y) {
	};

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
