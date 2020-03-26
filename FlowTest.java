import java.awt.*;
import javax.swing.*;

class FlowTest extends JFrame
{
	FlowTest()
	{
		setSize(600,500);
		setTitle(" Test");
		setLayout(new FlowLayout());

		for(int i=1;i<=20;i++)
		{
				JButton b = new JButton("Button " +i);
				add(b);
		}

	}
	public static void main(String args[])
	{
			FlowTest f = new FlowTest();
			f.setDefaultCloseOperation(3);
			f.setVisible(true);
	}
}
