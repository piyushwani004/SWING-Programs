import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Program11 extends JFrame implements ActionListener
{
	JPanel center = new JPanel();
	JPanel north = new JPanel();
	JLabel label = new JLabel("Info Planet",JLabel.CENTER);

	Program11()
	{
		setSize(600,500);
		setTitle("CheckBox Test");

		ButtonGroup gp = new ButtonGroup();
		String lbl[]={"8","12","18","24","30","42"};

		for(int i=0;i<lbl.length;i++)
		{
			JRadioButton btn = new JRadioButton( lbl[i] );
			gp.add(btn);
			north.add(btn);
			btn.addActionListener(this);
		}
		add(north,"North");
		center.add(label);
		add(center);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		int size = Integer.parseInt(s);
		label.setFont(new Font("Arial",Font.PLAIN,size));
	}
	public static void main(String args[])
	{
		Program11 f = new Program11();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}


