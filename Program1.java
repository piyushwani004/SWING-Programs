
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Program1 extends JFrame implements ActionListener
{
	JLabel label = new JLabel("Info Planet",JLabel.CENTER);
	Program1()
	{
		setSize(600,500);
		label.setFont(new Font("Times New Roman",Font.BOLD,24));
		JPanel p = new JPanel();

		String s[] = {"Left","Center","Right"};

		for(int i=0;i<s.length;i++)
		{
				JButton b = new JButton(s[i]);
				p.add(b);
				b.addActionListener(this);
		}
		add(p);
		add(label,"North");
	}
	public void actionPerformed(ActionEvent e)
	{
			String s = e.getActionCommand();
			if(s.equals("Left"))
			label.setHorizontalAlignment(JLabel.LEFT);
			else
			if(s.equals("Center"))
			label.setHorizontalAlignment(JLabel.CENTER);
			else
			label.setHorizontalAlignment(JLabel.RIGHT);
	}
	public static void main(String args[])
	{
		Program1 f = new Program1();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}



