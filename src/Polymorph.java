import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    Polymorph(int x, int y){
   	 this.setX(x);
   	 this.setY(y);
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
