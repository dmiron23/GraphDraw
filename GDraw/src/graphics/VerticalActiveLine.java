package graphics;

public class VerticalActiveLine extends ActiveLine {
		
		public boolean active = true;
		private int spawnState = -1;
		
		public VerticalActiveLine(int _x1, int _y1, float thickness) {
			super(_x1, _y1, thickness);
		}


		@Override
		public void handleLeftMouse(int mx, int my, boolean down) {
			if(down) return;
			spawnState++;
			if(spawnState == 1) active = false;
		}
		@Override
		public void handleMouse(int mx, int my) {
			if(!active) return;
			y2 = Math.min(y-20,my - parent.getLocationOnScreen().y); //Min is 20
			
		}
	


}
