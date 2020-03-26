
import javax.swing.*;
import java.awt.*;

class PanelTest extends JFrame
{
	PanelTest()
	{
		setSize(600,500);
		setTitle("Panel Test");

		JPanel north = new JPanel();
		north.add( new JButton("Red"));
		north.add( new JButton("Green"));
		north.add( new JButton("Blue"));
		north.setBackground(Color.red);
		add(north, "North");

		JPanel south = new JPanel();
		south.add( new JButton("Ok"));
		south.add( new JButton("Cancel"));
		south.setBackground(Color.green);
		add(south,"South");
	}
	public static void main(String [] args)
	{
		PanelTest f = new PanelTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}


