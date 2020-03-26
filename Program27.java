import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Program27 extends JFrame implements ActionListener
{
	JPanel panel = new JPanel();
	JButton color = new JButton("Color");
	Program27()
	{
		setSize(600,500);
		setTitle("Color Test");


		panel.add(color);
		add(panel);

		color.addActionListener(this);
		}

	public void actionPerformed(ActionEvent e)
	{
		Color clr = JColorChooser.showDialog(null,"Select Color", new Color(255,0,0));
		panel.setBackground(clr);
	}
	public static void main(String args[])
	{
		Program27 f = new Program27();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

