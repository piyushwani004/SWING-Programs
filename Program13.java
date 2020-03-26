import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Program13 extends JFrame implements ActionListener
{
	JComboBox cb = new JComboBox();
	JLabel label = new JLabel("Info Planet",JLabel.CENTER);

	Program13()
	{
		setSize(600,500);
		setTitle("Combo Box Test");

		label.setFont(new Font("Arial",Font.PLAIN, 42));
		add(label,"North");

		JPanel center = new JPanel();

		//obtain font list from the system
		String fnames[] =GraphicsEnvironment.getLocalGraphicsEnvironment()
													.getAvailableFontFamilyNames();

		for(int i=0; i<fnames.length; i++)
				cb.addItem(fnames[i]);

		center.add(cb);

		cb.addActionListener(this);
		add(center);
//		cb.setEditable(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String fontname= (String)cb.getSelectedItem();

		label.setFont(new Font(fontname,Font.PLAIN,42));
	}

	public static void main(String arg[])
	{
		Program13 f = new Program13();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

