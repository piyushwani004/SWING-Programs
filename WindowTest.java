import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowTest extends JFrame
{
	WindowTest()
	{
		setSize(600,500);
		setTitle("WindowEvent Test");
		addWindowListener( new WindowHandler());
	}
	class WindowHandler implements WindowListener
	{
		public void windowOpened(WindowEvent e)
		{
			System.out.println("Window Opened");
		}

		public void windowClosing(WindowEvent e)
		{
			System.out.println("Window Closing");
			dispose();
		}
		public void windowClosed(WindowEvent e)
		{
			System.out.println("Window Closed");

		}
		public void windowActivated(WindowEvent e)
		{
			System.out.println("Window Activated");
		}
		public void windowDeactivated(WindowEvent e)
		{
			System.out.println("Window Deactivated");
		}
		public void windowIconified(WindowEvent e)
		{
			System.out.println("Window Iconified");
		}
		public void windowDeiconified(WindowEvent e)
		{
			System.out.println("Window Deiconified");
		}

	}// end of WindowHandler class
	public static void main(String [] args)
	{
		WindowTest f = new WindowTest();
		 f.setVisible(true);
	}
}// End of Application class


