package canvas;

public class DelayThread extends Thread {
	public static AnimationControl ac;
	private int delay = 100;
	private int stateFlag;

	public DelayThread(int _delay, int _stateFlag) {
		delay = (int) (_delay / ac.getSpeed());
		stateFlag = _stateFlag;
		start();
	}

	public void run() {
		try {
			sleep(delay * 2);
			ac.stateFlag = stateFlag;
		} catch (InterruptedException e) {
		}

	}
}