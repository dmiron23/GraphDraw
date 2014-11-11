package graphics;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Bitmap extends GraphicsObject {
	private Image i;

	public Bitmap(Image _i, int _x, int _y) {
		i = _i;
		x = _x;
		y = _y;
	}

	public Bitmap(String name, int _x, int _y) {
		try {
			File f = new File(name);
			i = ImageIO.read(f);
		} catch (Exception e) {
		}

		x = _x;
		y = _y;
	}

	@Override
	public void draw(Graphics2D g) {

		
		g.drawImage(i,x, y, null);

	}

	@Override
	public void handleMouse(int mx, int my) {
	}

	@Override
	public void setAlpha(int a) {
	}

}
