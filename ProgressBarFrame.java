import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

class ProgressBarFrame extends JFrame
{
	JProgressBar pb = new JProgressBar(0,2000);
	JButton b = new JButton("Setup");

	ProgressBarFrame()
	{
		setSize(800,700);
		setTitle("Progress Bar");
		setLayout(new FlowLayout());
		add(b);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Thread t = new MyThread();
				t.start();
			}
		});
		add(pb);

		//pb.setValue(50);
		pb.setStringPainted(true);

	}
	class MyThread extends Thread
	{
		public void run()
		{
						int i=0;
							while(i<=2000)
							{
								pb.setValue(i);
								i=i+20;
								try
								{
									Thread.sleep(50);
								}
								catch(Exception ex)
								{
									System.out.println(ex);
								}
							}
						}
	}
	public static void main(String [] args)
	{
		ProgressBarFrame f = new ProgressBarFrame();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}
