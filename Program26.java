import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.*;

class Program26 extends JFrame implements ActionListener
{
	Program26()
	{
		setSize(800,600);
		setTitle("My Photo viewer");

		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem open = new JMenuItem("Open");
		file.add(open);
		mb.add(file);
		setJMenuBar(mb);
		open.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));

		chooser.setMultiSelectionEnabled(true);
		FileFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg","gif");
		chooser.setFileFilter(filter);

		int a =chooser.showOpenDialog(this);

		if(a==JFileChooser.APPROVE_OPTION)
		{
				File files[] = chooser.getSelectedFiles();
				int x=10,y=10;
				for(int i=0;i<files.length;i++)
				{
					ImageIcon icon =new ImageIcon(files[i].getPath());
					JFrame f = new JFrame(files[i].getName());
					f.setSize(300,200); //icon.getIconWidth()+50, icon.getIconHeight()+50);
					f.setLocation(x,y);
					x=x+30;
					y=y+30;

					JLabel label = new JLabel(icon);
					JScrollPane sp = new JScrollPane(label);
					f.add(sp);
					f.setVisible(true);
				}
			}
		}

	public static void main(String argws[])
	{
		Program26 f = new Program26();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

