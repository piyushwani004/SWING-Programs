import java.awt.*;  //FlowLayout
import javax.swing.*; //JFrame , JButton

class swingFrame extends JFrame
{
	JButton b = new JButton("Info Planet");

	swingFrame()
	{
		setSize(600,500);
		setTitle("Font Test");
		setLayout(new FlowLayout());
		add(b);
		b.setFont(new Font("Arial",Font.PLAIN,30));
	}

	public static void main(String args[])
	{
		swingFrame f = new swingFrame();
		f.setVisible(true);
	}
}// end


