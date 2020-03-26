
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class MouseMoveTest extends JFrame
{
	MouseMoveTest()
	{
		setSize(600,500);
		setTitle("Mouse Test");

		addMouseMotionListener( new MouseMotionAdapter()
											{
												public void mouseMoved(MouseEvent e)
												{
													int x = e.getX();
													int y = e.getY();
													String str = "x="+x+",y="+y;
													setTitle(str);
												}
											});
	}
	public static void main(String args[])
	{
		MouseMoveTest f = new MouseMoveTest();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}
