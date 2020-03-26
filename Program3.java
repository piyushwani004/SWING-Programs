import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Program3 extends JFrame implements ActionListener
{
	JTextField tf = new JTextField(20);
	JLabel label = new JLabel(" ", JLabel.CENTER);

	Program3()
	{
		setSize(600,500);
		setTitle("Text test");
		JPanel north = new JPanel();
		north.add( new JLabel("Name:"));
		north.add(tf);
		label.setFont(new Font("Times New Roman",Font.ITALIC,36));

		tf.addActionListener(this);
		add(north,"North");
		add(label);

	}

	public void actionPerformed(ActionEvent e)
	{
		String s = tf.getText();
		label.setText("Hello "+s);
		tf.setText("");
	}
	public static void main(String args[])
	{
		Program3 f = new Program3();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}
