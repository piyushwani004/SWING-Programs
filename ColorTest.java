import javax.swing.*;  		//JFrame
import java.awt.*;				// Graphics, Color, Font
import java.util.*;				//Random

class ColorTest extends JFrame
{
	ColorTest()
	{
		setSize(600,500);
		setTitle("Color Test");
		add( new DrawPanel());
	}
	class DrawPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			Random r = new Random();

			for(int i=1;i<=100;i++)
			{
				int red = r.nextInt(255);
				int green = r.nextInt(255);
				int blue = r.nextInt(255);

				g.setColor(new Color(red,green,blue));

				int x= r.nextInt(600);
				int y= r.nextInt(500);
				int w= r.nextInt(200);

				g.fillOval(x,y,w,w);
			}
		}
	}
	public static void main(String args[])
	{
		ColorTest f = new ColorTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

