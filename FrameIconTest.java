import java.awt.*;
import javax.swing.*;

class FrameIconTest extends JFrame
{
	Image img;

	FrameIconTest()
	{
		setSize(600,500);
		setTitle("Font Test");
		img = Toolkit.getDefaultToolkit().getImage("king.gif");

		setIconImage( img);

	}

	public static void main(String args[])
	{
		FrameIconTest f = new FrameIconTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}// end


