import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

class Program20 extends JFrame
{
	JMenuBar mb = new JMenuBar();
	JMenu f = new JMenu("File");

	JToolBar tb = new JToolBar();
	JButton n = new JButton("New");
	JButton s = new JButton(new ImageIcon("icon2.jpg"));
	JButton open = new JButton(new ImageIcon("icon3.jpg"));
	JButton exit = new JButton(new ImageIcon("icon4.jpg"));

	Program20()
	{
		setSize(600,500);
		setTitle("MyFrame");
		mb.add(f);
		setJMenuBar(mb);
		tb.add(n);
		tb.add(s);
		tb.add(open);
		tb.setBorder( new BevelBorder(BevelBorder.LOWERED));
		tb.addSeparator();
		tb.add(exit);
		tb.setFloatable(true);

		n.setToolTipText("New ");
		s.setToolTipText("Save ");
		open.setToolTipText("Open ");
		exit.setToolTipText("Exit ");

		add(tb,"North");

		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String args[])
	{
		Program20 f = new Program20();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}
