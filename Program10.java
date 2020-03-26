import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Program10 extends JFrame implements ActionListener
{
	JCheckBox r = new JCheckBox("Red");
	JCheckBox g = new JCheckBox("Green");
	JCheckBox b = new JCheckBox("Blue");

	JPanel panel = new JPanel();

	Program10()
	{
		setSize(600,500);
		setTitle("Color Test");

		panel.add(r);
		panel.add(g);
		panel.add(b);
		add(panel);

		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
		panel.setBackground(Color.black);

	}
	public void actionPerformed(ActionEvent e)
	{
		int x=0,y=0,z=0;
		if(r.isSelected())
			x=255;

		if(g.isSelected())
			y=255;

		if(b.isSelected())
				z=255;

		Color clr = new Color(x,y,z);
		panel.setBackground(clr);
	}

	public static void main(String args[])
	{
		Program10 f = new Program10();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}



