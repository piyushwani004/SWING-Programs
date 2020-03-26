import javax.swing.*;
import java.awt.*;

class Program5 extends JFrame
{
	JTextArea ta = new JTextArea(10,30);

	Program5()
	{
		setSize(600,500);
		setTitle("MyNotepad");
		JScrollPane pane = new JScrollPane(ta);
		add(pane);

		ta.setFont(new Font("Times New Roman", Font.PLAIN, 30));

	}
	public static void main(String args[])
	{
		Program5 f = new Program5();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}


