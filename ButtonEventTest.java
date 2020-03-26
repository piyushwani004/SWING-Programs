
import javax.swing.*;// JFrame, JButton
import java.awt.event.*;  //ActionEvent,ActionListener
import java.awt.*; //FlowLayout

class ButtonEventTest extends JFrame implements ActionListener
{
	JButton b = new JButton("Ok");

	ButtonEventTest()
	{
		setSize(600,500);
		setTitle("Button Test");
		setLayout(new FlowLayout());
		add(b);
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
			System.out.println(e.getActionCommand());
	}

	public static void main(String [] args)
	{
		ButtonEventTest f = new ButtonEventTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}





