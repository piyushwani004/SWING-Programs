import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonHideTest extends JFrame implements ActionListener
{
	JButton b1 = new JButton("Hide");
	JButton b2 = new JButton("Info");

	ButtonHideTest()
	{
		setSize(600,500);
		setTitle("Color Test");

		JPanel panel = new JPanel();
		panel.add(b1);
		panel.add(b2);
		add(panel);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		if(str.equals("Hide"))
		{
			b2.setVisible(false);
			b1.setText("Show");
		}
		else
		{
			b2.setVisible(true);
			b1.setText("Hide");
		}
	}
	public static void main(String args[])
	{
		ButtonHideTest f = new ButtonHideTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

