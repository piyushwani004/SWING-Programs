import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseLeftRightTest extends JFrame
{
	MouseLeftRightTest()
	{
		setSize(600,500);
		setTitle("Mouse Test");
		DrawPanel panel = new DrawPanel();
		add(panel);
	}
	public static void main(String [] args)
	{
		MouseLeftRightTest f = new MouseLeftRightTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}// end of frame class

	class DrawPanel extends JPanel
	{
		int x, y,f;
		DrawPanel()
		{
			addMouseListener( new MouseAdapter()
											{
												public void mouseClicked(MouseEvent e)
												{
													x=e.getX();
													y=e.getY();

													// code for left click
												if((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0)
														f=1;
												else    // code for right click
												if((e.getModifiers() & InputEvent.BUTTON3_MASK)!=0)
														f=2;
													repaint();
												}
											});
		}
		public void paintComponent(Graphics g)
		{
			if(f==1)
			g.drawRect(x,y,50,50);
			else
			if(f==2)
			g.drawOval(x,y,50,50);
		}
	}// end of panel class