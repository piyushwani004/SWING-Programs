import java.awt.*;
import javax.swing.*;

class TableFrame extends JFrame
{
	TableFrame()
	{
		setSize(600,500);
		setTitle(" Test");

		String [] col_names = {"Emp_no","Emp_Name","Emp_Salary"};

		Object[][] data = {{10,"xyz",5000.0},
							{20,"ABC",6000.0},
							{30,"PQR",7000.0},
							{40,"Atul",100000.0}
							};

		JTable table = new JTable(data,col_names);
		table.setRowHeight(30);
		table.setRowMargin(20);
		JScrollPane sp= new JScrollPane(table);
		add(sp);
		table.setFont(new Font("Arial",Font.PLAIN,25));
	}

	public static void main(String args[])
	{
			TableFrame f = new TableFrame();
			f.setDefaultCloseOperation(3);
			f.setVisible(true);
	}
}
