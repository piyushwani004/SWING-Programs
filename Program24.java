import javax.swing.*;

class Program24
{
	public static void main(String args[])
	{

		int x =JOptionPane.showConfirmDialog(null,"Do you want to save the file",
		                                "confirm",JOptionPane.YES_NO_CANCEL_OPTION,
		                                         JOptionPane.QUESTION_MESSAGE);
		String s="";
		if(x==JOptionPane.YES_OPTION)
		s="YES";
		else
		if(x==JOptionPane.NO_OPTION)
		s="NO";
		else
		if(x==JOptionPane.CANCEL_OPTION)
		s="CANCEL";

		                JOptionPane.showMessageDialog(null,s+ " option is selected ",
		                                "MSG",JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}
