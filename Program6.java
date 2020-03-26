import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

class Program6 extends JFrame implements ActionListener
{

	JTextArea ta = new JTextArea();
	JTextField tf = new JTextField(20);
	JButton open = new JButton("Open");
	JButton save = new JButton("Save");

	Program6()
	{
		setSize(600,500);
		setTitle("My Notepad");
		JScrollPane sp = new JScrollPane(ta);
		add(sp,"Center");

		JPanel south = new JPanel();
		south.add(new JLabel("File Name:"));
		south.add(tf);
		south.add(open);
		south.add(save);

		add(south,"South");
		open.addActionListener(this);
		save.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		String fname = tf.getText();
		if(s.equals("Open"))
		{
			try
			{
				BufferedReader fin = new BufferedReader(new FileReader(fname));
				String t=fin.readLine();
				while(t!=null)
				{
					ta.append(t+"\n\r");
					t=fin.readLine();
				}
				fin.close();
			}
			catch(IOException ev)
			{
				JOptionPane.showMessageDialog(null,"File not found");
			}
		}
		else
		{
			try
			{
				PrintWriter fout = new PrintWriter(fname);
				String t =ta.getText();
				fout.print(t);
				fout.close();
			}
			catch(Exception o)
			{		}
		}
	}// end of actionPerformed
	public static void main(String args[])
	{
		Program6 f = new Program6();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}
