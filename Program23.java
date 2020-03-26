import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Program23 extends JFrame
{
	public Program23 ()
	{
		setSize(400,300);                               // JTabbedPane()
		setTitle("Tabbed Pane test");						//void addTab(String label, Container con)
		String label[]={"One","Two","Three","Four"};

		Color [] c= {Color.red,Color.green,Color.blue,Color.pink};

		JTabbedPane pane = new JTabbedPane(JTabbedPane.LEFT);
		for(int i=0;i<label.length;i++)
		{
			JPanel p = new JPanel();
			for(int j=0;j<=i;j++)
				p.add(new JButton("Button "+(j+1)));
			p.setBackground(c[i]);
			pane.addTab(label[i],new ImageIcon("king.gif"),p);
		}
		add(pane);
	}
	public static void main(String args[])
	{
		Program23 f = new Program23();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}


