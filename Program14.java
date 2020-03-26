import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Program14 extends JFrame implements ListSelectionListener
{
	String []items = {"PD","CD","HDD","CPU","KB","MB","Mouse",
	                                      "Plotter","Printer","Scanner"};
	JList list = new JList(items);
	JLabel label = new JLabel();

	Program14()
	{
		setSize(600,500);
		setTitle("List  Box Test");
		JPanel center = new JPanel();

		JScrollPane sp = new JScrollPane(list);
		list.setVisibleRowCount(5);
		center.add(sp);
		add(center);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(this);
		add(label,"North");
	}
	public void valueChanged(ListSelectionEvent e)
	{
		Object values[] = list.getSelectedValues();
			String s = "Selected items are ";
			for(int i=0;i<values.length;i++)
					s=s+values[i]+ " ";
			label.setText(s);
	}
	public static void main(String arg[])
	{
		Program14 f = new Program14();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

