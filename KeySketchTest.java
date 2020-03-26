import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeySketchTest extends JFrame
{
	KeySketchTest()
	{
		setSize(600,500);
		setTitle("Key Test");

		DrawPanel panel = new DrawPanel();
		add(panel);
	}
	public static void main(String args[])
	{
		KeySketchTest f = new KeySketchTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
} // end of frame class

class DrawPanel extends JPanel
{
	int x1,x2,y1,y2;

	DrawPanel()
	{
			KeyHandler handler = new KeyHandler();
			addKeyListener(handler);
			x1=x2=y1=y2=100;

			setFocusable(true);
		}
		class KeyHandler extends KeyAdapter
		{
			public void keyPressed(KeyEvent e)
			{
				int code=e.getKeyCode();

				int d=2;

				if(e.isShiftDown())
					d=10;

				if(code==KeyEvent.VK_RIGHT)
				 x2=x1+d;
				else
				if(code==KeyEvent.VK_LEFT)
					x2=x1-d;
				else
				if(code==KeyEvent.VK_DOWN)
					y2=y1+d;
				else
				if(code==KeyEvent.VK_UP)
					y2=y1-d;
				repaint();
			}
		} // end of key handler class
		public void paintComponent(Graphics g)
		{
			//super.paintComponent(g);
			g.drawLine(x1,y1,x2,y2);
			x1=x2;
			y1=y2;
		}
	} // end of panel class


