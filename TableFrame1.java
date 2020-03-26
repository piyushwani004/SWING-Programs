import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;  	//JTableHeader
class TableFrame1 extends JFrame
{
	TableFrame1()
	{
		setSize(900,800);
		setTitle("Table Demo");

DefaultTableModel m = new DefaultTableModel(0,3);

			//table.setModel(m);

		Object [] r ={100,"INFO",99999.0};

		m.addRow(r);



/*		String [] col_names = {"Emp_Number", "Emp_Name","Emp_Salary"};

		Object[][] data = {  {10,"Atul",1000000},
				     								{20,"Nilesh", 90000},
				     								{30,"Priya", 60000},
				     								{40,"Rahul",40000},
				     								{50,"Akanksha",50000} };*/
		final JTable table = new JTable(m);

		JScrollPane sp = new JScrollPane(table);

		add(sp);
		//table.selectAll();
		table.setGridColor(Color.RED);
		table.setRowHeight(50);
		table.setFont(new Font("Times New Roman",Font.BOLD, 24));
		//table.setRowSelectionAllowed(false);
		table.setSelectionBackground(Color.PINK);
		table.setSelectionForeground(Color.BLUE);
		//table.setShowGrid(false);
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(true);
		//table.setValueAt("Ajay",0,1);
		//System.out.println(table.getColumnCount());
		//System.out.println(table.getColumnName(1));
		//getSelectedColumn()
		//getSelectedColumnCount()
		//getSelectedColumns()
		//getSelectedRow();
		//getSelectedRowCount()
		//getSelectedRows()
		table.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				int x = table.getSelectedRow();
				System.out.println(table.getValueAt(x,0)+"\t"+table.getValueAt(x,1));

			}
			});
			//DefaultTableModel m = new DefaultTablemodel();

		JTableHeader header = table.getTableHeader();
		header.setBackground(Color.yellow);
		header.setFont(new Font("Times New Roman",Font.BOLD,20));

	}
	public static void main(String [] args)
	{
		TableFrame1 f = new TableFrame1();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

