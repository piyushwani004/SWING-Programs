import javax.swing.*;
import java.awt.*;

class Program2 extends JFrame
{

	Program2()
	{
		setSize(600,500);
		setLayout(new FlowLayout());
		String s[] = {"ace.gif","jack.gif","king.gif","queen.gif","nine.gif"};
		for(int i=0;i<s.length;i++)
		{
			JLabel b = new JLabel(new ImageIcon(s[i]));
			add(b);
		}
	}

	public static void main(String args[])
	{
		Program2 f = new Program2();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}



