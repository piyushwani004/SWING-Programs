import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Program4 extends JFrame implements ActionListener
{
	JLabel result = new JLabel(" ",JLabel.CENTER);
	JTextField tf1 = new JTextField(20);
	JTextField tf2 = new JTextField(20);

	Program4()
	{
		setSize(600,500);
		setTitle("Test");

		String s[]={"+","-","*","/"};

		JPanel north = new JPanel();
		north.add(new JLabel("No1:"));
		north.add(tf1);
		north.add(new JLabel("No2:"));
		north.add(tf2);

		JPanel center = new JPanel();
		for(int i=0; i<s.length; i++)
		{
			JButton b = new JButton(s[i]);
			center.add(b);
			b.addActionListener(this);
		}

		result.setFont(new Font("Arial",Font.BOLD,30));
		result.setForeground(Color.red);

		add(north,"North");
		add(center);
		add(result,"South");
	}
	public void actionPerformed(ActionEvent e)
	{
		String t = e.getActionCommand();
		int x = Integer.parseInt(tf1.getText());
		int y = Integer.parseInt(tf2.getText());

		if(t.equals("+"))
			result.setText("Add="+(x+y));
		else
		if(t.equals("-"))
			result.setText("Sub="+(x-y));
		else
		if(t.equals("*"))
			result.setText("Mul="+(x*y));
		else
			result.setText("Div="+((float)x/y));
	}
	public static void main(String args[])
	{
		Program4 f = new Program4();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}


