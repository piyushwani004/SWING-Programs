import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ActionEventTest extends JFrame
{
	JButton b = new JButton("Ok");

	ActionEventTest()
	{
		setSize(600,500);
		setTitle("ButtonEvent test");
		setLayout(new FlowLayout());
		add(b);

		ButtonHandler handler = new ButtonHandler();
		b.addActionListener(handler);
	}

	class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Hello World");
		}
	}

	public static void main(String [] args)
	{
		ActionEventTest f  = new ActionEventTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}



