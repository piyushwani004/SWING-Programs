import java.awt.*;
import javax.swing.*;

class GridTest extends JFrame
{
	GridTest()
	{
		setSize(600,500);
		setTitle(" Test");
		setLayout(new GridLayout(3,4));

		for(int i=1;i<=12;i++)
		{
				JButton b = new JButton("Button " +i);
				add(b);
		}
	}

	public static void main(String args[])
	{
			GridTest f = new GridTest();
			f.setDefaultCloseOperation(3);
			f.setVisible(true);
	}
}
