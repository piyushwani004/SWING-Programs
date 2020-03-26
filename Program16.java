import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
class Program16 extends JFrame implements ChangeListener
{
		JSlider red = new JSlider(0,255,0);
		JSlider green = new JSlider(0,255,0);
		JSlider blue = new JSlider(0,255,0);

		JPanel panel=new JPanel();
		public Program16()
		{
			setSize(270,400);
			setTitle("Program16");
			panel.add(new JLabel("Red:"));
			panel.add(red);
			panel.add(new JLabel("Green:"));
			panel.add(green);
			panel.add(new JLabel("Blue:"));
			panel.add(blue);

			red.addChangeListener(this);
			green.addChangeListener(this);
			blue.addChangeListener(this);
			panel.setBackground(Color.BLACK);

			add(panel);
		}

		public void stateChanged(ChangeEvent e)
		{
				int r=0,g=0,b=0;
				r= red.getValue();
				g=green.getValue();
				b=blue.getValue();
				Color c = new Color(r,g,b);
				panel.setBackground( c );
				String str=""+r+","+g+","+b;
				setTitle(str);
		}

	public static void main(String args[])
	{
		Program16 frame = new Program16();
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
	}
}
