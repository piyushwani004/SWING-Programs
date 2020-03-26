import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Program15 extends JFrame implements ActionListener
{
	DefaultListModel list = new DefaultListModel();
	JList lc = new JList(list);
	JTextField tf = new JTextField(20);
	JButton a= new JButton("Add");
	JButton r = new JButton("Remove");

	Program15()
	{
		setSize(600,500);
		JPanel center = new JPanel();
		JScrollPane sp = new JScrollPane(lc);
		center.add(sp);

		JPanel north = new JPanel();
		north.add(new JLabel("Item:"));
		north.add(tf);
		north.add(a);
		north.add(r);

		add(north,"North");
		add(center);

		a.addActionListener(this);
		r.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s= e.getActionCommand();
		if(s.equals("Add"))
		list.addElement(tf.getText());
		else
		list.removeElement(tf.getText());
		tf.setText("");
	}
	public static void main(String args[])
	{
		Program15 f = new Program15();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

