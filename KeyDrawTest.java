import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class KeyDrawTest extends JFrame
{
	KeyDrawTest()
	{
		setSize(600,500);
		setTitle("Key Test");

		DrawPanel panel = new DrawPanel();
		add(panel);
	}
	public static void main(String args[])
	{
		KeyDrawTest f = new KeyDrawTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
} // end of frame class

class DrawPanel extends JPanel
{
	int code;
	DrawPanel()
	{
			KeyHandler handler = new KeyHandler();
			addKeyListener(handler);
			setFocusable(true);
		}
		class KeyHandler extends KeyAdapter
		{
			public void keyPressed(KeyEvent e)
			{
				code=e.getKeyCode();
				repaint();
			}
		}
		public void paintComponent(Graphics g)
		{

			super.paintComponent(g);

			if(code==KeyEvent.VK_R)
			g.drawRect(50,50,300,200);

			if(code==KeyEvent.VK_C)
			g.drawOval(50,50,200,200);

			if(code==KeyEvent.VK_L)
			g.drawLine(50,50,300,200);
		}
	}// end of panel class



