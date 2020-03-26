import java.awt.*;
import javax.swing.*;

class FontTest extends JFrame
{

	FontTest()
	{
		setSize(600,500);
		setTitle("Font Test");

		DrawPanel panel = new DrawPanel();
		add(panel);
	}

	class DrawPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{

				Font font = new Font("Times New Roman", Font.BOLD+Font.ITALIC,60);
				g.setFont(font);
				g.drawString("Info Planet", 50,400);
		}
	}

	public static void main(String args[])
	{
		FontTest f = new FontTest();
		f.setVisible(true);
	}
}// end


