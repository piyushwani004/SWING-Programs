import javax.swing.*;
import java.awt.*;

class DrawTest extends JFrame
{
	DrawTest()
	{
		setSize(600,500);
		setTitle("Draw Test");
		DrawPanel panel = new DrawPanel();
		add(panel);
	}
	class DrawPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.drawLine(50,50,200,200);
		}
	}
	public static void main(String [] args)
	{
		DrawTest f = new DrawTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}
