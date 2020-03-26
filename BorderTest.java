import java.awt.*;
import javax.swing.*;

class BorderTest extends JFrame
{
	JButton n = new JButton("North");
	JButton s = new JButton("South");
	JButton c = new JButton("Center");
	JButton w = new JButton("West");
	JButton e = new JButton("East");

	BorderTest()
	{
		setSize(600,500);
		setTitle(" Test");
		add(n,"North");
		add(s,"South");
		add(c);
		add(w,"West");
		add(e,"East");
	}

	public static void main(String args[])
	{
			BorderTest f = new BorderTest();
			f.setDefaultCloseOperation(3);
			f.setVisible(true);
	}
}
