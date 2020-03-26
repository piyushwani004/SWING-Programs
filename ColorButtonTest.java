import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ColorButtonTest extends JFrame implements ActionListener
{
	JButton red = new JButton("Red");
	JButton green = new JButton("Green");
	JButton blue = new JButton("Blue");
	JPanel panel = new JPanel();

	ColorButtonTest()
	{
		setSize(600,500);
		setTitle("Color Test");

		panel.add(red);
		panel.add(green);
		panel.add(blue);
		add(panel);

		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object  src = e.getSource();

		if(src==red)
			panel.setBackground(Color.red);
		else
		if(src==green)
			panel.setBackground(Color.green);
		else
			panel.setBackground(Color.blue);
	}

	public static void main(String args[])
	{
		ColorButtonTest f = new ColorButtonTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}  // end of frame class



