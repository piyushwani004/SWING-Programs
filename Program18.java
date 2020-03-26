import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Program18 extends JFrame implements ActionListener
{
	JMenuBar mb = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu edit = new JMenu("Edit");
	JMenuItem n = new JMenuItem("New",new ImageIcon("icon1.jpg"));

JMenuItem open = new JMenuItem("Open",
	                       new ImageIcon("icon2.jpg"));

	JMenuItem save = new JMenuItem("Save",
	                         new ImageIcon("icon3.jpg"));

	JMenuItem exit = new JMenuItem("Exit",
	                       new ImageIcon("icon4.jpg"));

	JMenuItem cut = new JMenuItem("Cut",
	                      new ImageIcon("icon5.jpg"));

	JMenuItem copy = new JMenuItem("Copy");
	JMenuItem paste = new JMenuItem("Paste");

	JCheckBoxMenuItem bold = new JCheckBoxMenuItem("Bold");


	JRadioButtonMenuItem radio=  new JRadioButtonMenuItem("Radio");

	Program18()
	{
		setSize(600,500);
		setTitle("MenuTest");
		//mb.setBackground(Color.pink);
		file.add(n);
		n.setMnemonic('N');

		n.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N , InputEvent.CTRL_MASK));

		n.setToolTipText("Open New File");
		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);

		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(bold);
		edit.add(radio);

		mb.add(file);
		mb.add(edit);
		setJMenuBar(mb);

		n.addActionListener(this);
		open.addActionListener(this);
		exit.addActionListener(this);
		save.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		setTitle(s+" Menu item is selected");
	}
	public static void main(String args[])
	{
		Program18 f = new Program18();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}