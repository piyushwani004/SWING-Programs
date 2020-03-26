import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ButtonFrame extends JFrame
{
	JButton ok = new JButton("Info Planet", new ImageIcon("king.gif"));
	ButtonFrame()
	{
		setSize(600,500);
		setTitle("Button Test");
		setLayout(new FlowLayout());
		add(ok);
	}
	public static void main(String [] args)
	{
		ButtonFrame f = new ButtonFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

