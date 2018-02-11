import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class MovingPolymorph extends Polymorph{
	boolean up = false;
	MovingPolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {

		BufferedImage img = null;
		URL url;
		try {
			url = new URL("https://images-na.ssl-images-amazon.com/images/I/41FC46PWBlL._SY355_.jpg");
			try {
				img = ImageIO.read(url);
				
				g.drawImage(img, getX(), getY(), 100, 125, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   

		
	}
	public void update() {
	

		setY(getY() + 2);	
		
	}
	
}
