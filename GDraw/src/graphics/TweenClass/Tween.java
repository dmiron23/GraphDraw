package graphics.TweenClass;

import java.awt.Point;

import canvas.AnimationControl;
import graphics.GraphicsObject;

public class Tween {
	public static AnimationControl ac;

	private TweenListener listener;
	public Point startPoint;
	public Point endPoint;
	public int startAlpha;
	public int endAlpha;

	public int divisor;
	public int currentStep;
	public GraphicsObject go;

	int distanceX;
	int distanceY;

	float stepX;
	float stepY;

	float diffAlpha;
	float stepAlpha;

	public int tweenMode;

	public Tween(Point _startPoint, Point _endPoint, int _startAlpha,
			int _endAlpha, int _divisor, int _tweenMode) {
		startPoint = _startPoint;
		endPoint = _endPoint;
		divisor = _divisor;
		startAlpha = _startAlpha;
		endAlpha = _endAlpha;
		distanceX = (endPoint.x - startPoint.x);
		distanceY = (endPoint.y - startPoint.y);
		stepX = distanceX / (float) divisor;
		stepY = distanceY / (float) divisor;
		diffAlpha = (endAlpha - startAlpha);
		stepAlpha = diffAlpha / (float) divisor;
		tweenMode = _tweenMode;
	}

	public Point getNextPoint() {
		for (int i = 0; i < ac.getSpeed(); i++)
			currentStep++;
		if (currentStep >= divisor) {
			go.x = endPoint.x;
			go.y = endPoint.y;
			go.setAlpha(endAlpha);
			raiseTweenEvent();
			go.tween = null;
			listener = null;
			return endPoint;
		} else
			return new Point(startPoint.x + (int) (currentStep * stepX),
					startPoint.y + (int) (currentStep * stepY));
	}

	public Point getEasedPoint() {
		double logStep = Math.log10((currentStep / (float) divisor) * 90 + 10) - 1;

		currentStep++;
		if (currentStep >= divisor) {
			go.x = endPoint.x;
			go.y = endPoint.y;
			go.setAlpha(endAlpha);
			raiseTweenEvent();
			go.tween = null;
			listener = null;
			return endPoint;
		} else
			return new Point((int) (logStep * distanceX + startPoint.x),
					(int) (logStep * distanceY + startPoint.y));

		// Take currentStep and divide by total steps to get %.
		// Plug % in to logarithm to get eased step.
	}

	public int getAlpha() {
		return startAlpha + (int) (stepAlpha * currentStep);
	}

	public void addTweenListener(TweenListener l) {
		listener = l;
	}

	public void removeTweenListener(TweenListener l) {
		listener = null;
	}

	private void raiseTweenEvent() {
		if (listener != null)
			listener.tweenCompleted(new TweenEvent(this));
	}
}
