import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class FollowPolymorph extends Polymorph{

	FollowPolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		int mouseX = (int) MouseInfo.getPointerInfo().getLocation().getX();
		int mouseY = (int) MouseInfo.getPointerInfo().getLocation().getY();
		g.fillRect(mouseX, mouseY, 50, 50);
	}
	
}
