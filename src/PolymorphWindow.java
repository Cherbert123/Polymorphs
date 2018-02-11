import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    Color colorBG = Color.RED; 
    Polymorph redPoly;
    Polymorph bluePoly;
    Polymorph movingPoly;
    Polymorph followPoly;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("Hi");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 bluePoly = new BluePolymorph(50, 50);
   	 followPoly = new FollowPolymorph(50, 50);
   	 redPoly = new RedPolymorph(350, 50);
   	 movingPoly = new MovingPolymorph(175, 50);
   	
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
    	
   	 g.setColor(colorBG);
   	 g.fillRect(0, 0, 500, 500);
   	 if(colorBG == Color.RED) {
   		colorBG = Color.ORANGE;
   	 }else if(colorBG == Color.GREEN) {
   		colorBG = Color.BLUE;
   	 }else if(colorBG == Color.BLUE) {
   		colorBG = Color.PINK;
   	 }else if(colorBG == Color.ORANGE) {
    		colorBG = Color.YELLOW;
    	 }else if(colorBG == Color.YELLOW) {
    	   		colorBG = Color.GREEN;
      }else if(colorBG == Color.PINK) {
	   		colorBG = Color.MAGENTA;
      }else if(colorBG == Color.MAGENTA) {
	   		colorBG = Color.RED;
      }
   	
   	 //draw polymorph
   	 bluePoly.draw(g);
   	 redPoly.draw(g);
   	 movingPoly.draw(g);
   	 followPoly.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 bluePoly.update();
   	 redPoly.update();
   	 movingPoly.update();
   	 followPoly.update();
   	 
    }
}
