import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ClickPolymorph extends Polymorph{
	boolean up = false;
	ClickPolymorph(int x, int y) {
		super(x, y);
	}
	int xInt = 0;
	int yInt = 0;

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.cyan);
		g.fillRect(getX(), getY(), 50, 50);
	   

		
	}
	public void update() {
		int settY = (int) (getY() + Math.cos(yInt));
		int settX = (int) (getX() + Math.sin(xInt));
		setY(settY);	
		setX(settX);	
		yInt = yInt + 15;
		xInt = xInt + 15;
	}
	
}
