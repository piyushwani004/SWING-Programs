import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowAdapterTest extends JFrame
{
	WindowAdapterTest()
	{
		setSize(600,500);
		setTitle("WindowEvent Test");
		addWindowListener( new WindowHandler());
	}
	class WindowHandler extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
					int x =JOptionPane.showConfirmDialog(null,"Save file");

					if(x==JOptionPane.YES_OPTION)
					{
						System.out.println("Window Closing");
						dispose();
					}
		}

	}
	public static void main(String [] args)
	{
		WindowAdapterTest f = new WindowAdapterTest();
		 f.setDefaultCloseOperation(0);
		 f.setVisible(true);
	}
}



