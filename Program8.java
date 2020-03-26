import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Program8 extends JFrame implements ActionListener
{
	JPasswordField pass = new JPasswordField(15);
	JLabel label = new JLabel(" ",JLabel.CENTER);

	Program8()
	{
		setSize(600,500);
		JPanel p = new JPanel();
		p.add(new JLabel("Password :"));
		p.add(pass);
		add(p);
		add(label,"South");

		pass.addActionListener(this);
		label.setFont(new Font("Times New Roman",Font.PLAIN,28));

		//pass.setEchoChar('#');

	}
	public void actionPerformed(ActionEvent e)
	{
		char ch[]=pass.getPassword();
		String s = new String(ch);
		label.setText("Password is :"+s);
		pass.setText("");
	}
	public static void main(String args[])
	{
		Program8 f = new Program8();
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
	}
}

