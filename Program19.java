import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Program19 extends JFrame implements ActionListener
{
	JPanel p = new JPanel();
	JPopupMenu popup = new JPopupMenu();
	JCheckBoxMenuItem red = new JCheckBoxMenuItem("Red");
	JCheckBoxMenuItem green = new JCheckBoxMenuItem("Green");
	JCheckBoxMenuItem blue = new JCheckBoxMenuItem("Blue");

	Program19()
	{
		setSize(600,500);
		setTitle("Menu Frame");
		popup.add(red);
		popup.add(green);
		popup.add(blue);
		add(p);
		p.addMouseListener(new MouseHandler());
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
	}
	class MouseHandler extends MouseAdapter
	{
		public void mouseReleased(MouseEvent e)
		{
			if(e.isPopupTrigger())
			popup.show(e.getComponent(), e.getX(),e.getY());
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		int r=0,g=0,b=0;
		r=red.isSelected() ?  255 : 0;
		g=green.isSelected()? 255 : 0;
		b=blue.isSelected()? 255 : 0;
		Color c = new Color(r,g,b);
		p.setBackground(c);
	}
	public static void main(String args[])
	{
		Program19 f = new Program19();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}











