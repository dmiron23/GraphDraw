package graphics.TweenClass;

import java.util.EventObject;

public class TweenEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TweenEvent(Tween t) {
		super(t);
	}

}
