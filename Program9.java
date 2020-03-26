import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Program9 extends JFrame implements ActionListener
{
	JLabel label = new JLabel("Info Planet",JLabel.CENTER);

	JCheckBox bold = new JCheckBox("Bold");
	JCheckBox italic = new JCheckBox("Italic");

	Program9()
	{
		setSize(600,500);
		setTitle("Check box test app");
		JPanel p = new JPanel();
		p.add(bold);
		p.add(italic);
		add(p,"South");
		bold.addActionListener(this);
		italic.addActionListener(this);

		label.setFont(new Font("Times New Roman",Font.PLAIN,36));
		add(label);
	}
	public void actionPerformed(ActionEvent e)
	{
		int m=0;
		if(bold.isSelected())
		m=m+Font.BOLD;

		if(italic.isSelected())
		m=m+Font.ITALIC;

		label.setFont(new Font("Times New Roman",m,36));
	}
	public static void main(String args[])
	{
		Program9 f = new Program9();
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
	}
}


