import  javax.swing.*;
import java.awt.*;

class FrameDrawDemo extends JFrame
{
	FrameDrawDemo()
	{
		setSize(500,400);
		setTitle("My Frame");
		DrawPanel panel = new DrawPanel();
		add(panel);
	}

	class DrawPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
				g.drawString("Demo. of Graphics Methods",50,20);
				g.drawLine(50,30,200,30);
				g.drawRect(50,40,100,100);
				g.drawRoundRect(200,50,100,100,50,50);
				g.drawOval(50,200,100,100);  // circle
				g.drawOval(200,200,200,100); //ellipse
				g.drawArc(50,200,200,200,180,180);
		}
	}// end of panel class

	public static void main(String [] args)
	{
		FrameDrawDemo f = new FrameDrawDemo();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

