import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LineTest extends JFrame
{
	LineTest()
	{
		setSize(600,500);
		setTitle("Mouse Test");
		DrawPanel panel = new DrawPanel();
		add(panel);
	}
	public static void main(String args[])
	{
		LineTest f = new LineTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}// end of Frame class

class DrawPanel extends JPanel
	{

		int x1,y1,x2,y2;
		DrawPanel()
		{
			addMouseListener(new MouseAdapter()
										{
											public void mousePressed(MouseEvent e)
											{
												x1=e.getX();
												y1=e.getY();
											}
										});
			addMouseMotionListener(new MouseMotionAdapter()
													{
														public void mouseDragged(MouseEvent e)
														{
															x2=e.getX();
															y2=e.getY();
															repaint();
														}
													});
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawLine(x1,y1,x2,y2);
		}
	}  // end of panel class



