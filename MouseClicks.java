import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseClicks extends JFrame
{
	MouseClicks()
	{
		setSize(600,500);
		setTitle("Mouse Test");
		DrawPanel panel = new DrawPanel();
		add(panel);
	}
	public static void main(String args[])
	{
			MouseClicks f = new MouseClicks();
			f.setDefaultCloseOperation(3);
			f.setVisible(true);
	}
}
class DrawPanel extends JPanel
{
	int x,y;
	int c;
	DrawPanel()
	{
		MouseHandler handler = new MouseHandler();
		addMouseListener(handler);
	}
	class MouseHandler extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			x=e.getX();
			y=e.getY();
			c=e.getClickCount();
			repaint();
		}
	}
	public void paintComponent(Graphics g)
	{
		if(c==1)
			g.drawRect(x,y,30,30);
		else
		if(c==2)
		{
			g.setColor(Color.blue);
			g.fillRect(x,y,30,30);
		}
	}
}// end of panel

