import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Program25 extends JFrame implements ActionListener
{
	JMenuBar mb = new JMenuBar();
	JMenu help = new JMenu("Help");
	JMenuItem about = new JMenuItem("About");

	AboutDialog dlg;

	Program25()
	{
		setSize(600,500);
		setTitle("Dlg Test");

		mb.add(help);
		help.add(about);
		setJMenuBar(mb);

		about.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(dlg==null)
			dlg=new AboutDialog(this);
		dlg.setLocation(100,100);
		dlg.setVisible(true);
	}
	public static void main(String args[])
	{
		Program25 f = new Program25();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

class AboutDialog extends JDialog
{
	JLabel label = new JLabel("<html><h1><b><u> Programmed By: Info Planet</u></b></html>", JLabel.CENTER);
	JButton ok = new JButton("Ok");
	AboutDialog(JFrame parent)
	{
		super(parent,"About",false);
		JPanel p = new JPanel();
		p.add(ok);
		add(label);
		add(p,"South");
		ok.addActionListener( new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
									setVisible(false);
								}
							});
		setSize(300,200);
	}
}


