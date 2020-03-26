import java.awt.*;
import javax.swing.*;

class NullTest extends JFrame
{
	NullTest()
	{
		setSize(600,500);
		setTitle("Null Test ");

		setLayout(null);

		JButton b1 = new JButton("Ok");
		JButton b2 = new JButton("Cancel");

		b1.setBounds(100,100,80,30);
		b2.setBounds(200,100,80,30);
		add(b1);
		add(b2);
	}
	public static void main(String [] args)
	{
		NullTest f = new NullTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}


