import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Program17 extends JFrame implements ActionListener
{

	JPanel p =new JPanel();
	JMenuBar mb = new JMenuBar();

	JMenu color = new JMenu("Color");
	JMenu help = new JMenu("Help");

	JMenuItem red =new JMenuItem("Red",'R');

	JMenuItem green =new JMenuItem("Green",'G');
	JMenuItem blue =new JMenuItem("Blue",'B');
	JMenuItem exit =new JMenuItem("Exit",'E');
	Program17 ()
	{
		setSize(400,300);

		color.add(red);
		color.add(green);
		color.add(blue);
		color.addSeparator();
		color.add(exit);

		mb.add(color);
		mb.add(help);
		setJMenuBar(mb);

		add(p);

		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e)
		{
			String s=e.getActionCommand();

			if(s.equals("Red"))
				p.setBackground(Color.red);
			else
			if(s.equals("Green"))
				p.setBackground(Color.green);
			else
			if(s.equals("Blue"))
				p.setBackground(Color.blue);
			else
				System.exit(0);
		}
		public static void main(String args[])
		{
			Program17 f = new Program17();
			f.setDefaultCloseOperation(3);
			f.setVisible(true);
		}
}