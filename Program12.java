import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Program12 extends JFrame implements ActionListener
{
	JComboBox cb;
	Program12()
	{
		setSize(600,500);
		setTitle("Combo Box Test");

		String [] names = {"India","USA","Japan","UK"};
		cb = new JComboBox(names);

		JPanel center = new JPanel();

		center.add(cb);

		cb.addActionListener(this);
		add(center);
		cb.setEditable(true);
	}
	public void actionPerformed(ActionEvent e)
	{
			String str =(String) cb.getSelectedItem();
			setTitle(str);

	}

	public static void main(String arg[])
	{
		Program12 f = new Program12();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

