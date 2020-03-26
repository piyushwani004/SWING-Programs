import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
class Program21 extends JFrame implements  TreeSelectionListener
{
	DefaultMutableTreeNode root =  new DefaultMutableTreeNode("India");
	JTree tree;

	Program21()
	{
		setSize(600,500);

		DefaultMutableTreeNode ms = new DefaultMutableTreeNode("MS");
		DefaultMutableTreeNode mp = new DefaultMutableTreeNode("MP");
		DefaultMutableTreeNode ka = new DefaultMutableTreeNode("KA");
		DefaultMutableTreeNode j = new DefaultMutableTreeNode("Jalgaon");
		DefaultMutableTreeNode m = new DefaultMutableTreeNode("Mumbai");
		DefaultMutableTreeNode i = new DefaultMutableTreeNode("Indore");
		DefaultMutableTreeNode b= new DefaultMutableTreeNode("Banglore");
		DefaultMutableTreeNode bh= new DefaultMutableTreeNode("Bhopal");

		root.add(ms);
		root.add(mp);
		root.add(ka);

		ms.add(j);
		ms.add(m);

		mp.add(i);
		mp.add(bh);
		ka.add(b);
		tree = new JTree(root);
		tree.addTreeSelectionListener(this);
		JScrollPane pane = new JScrollPane(tree);
		add(pane);
	}
	public void valueChanged(TreeSelectionEvent e)
	{
	//	System.out.println("Selection changed");
		DefaultMutableTreeNode node =
		                      (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
		setTitle("Selected Item is "+node);
	}
	public static void main(String args[])
	{
		Program21 f = new Program21();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
	}
}

	/*
	private void createNodes(DefaultMutableTreeNode top) {
	    DefaultMutableTreeNode category = null;
	    DefaultMutableTreeNode book = null;

	    category = new DefaultMutableTreeNode("Books for Java Programmers");
	    top.add(category);

	    //original Tutorial
	    book = new DefaultMutableTreeNode(new BookInfo
	        ("The Java Tutorial: A Short Course on the Basics",
	        "tutorial.html"));
	    category.add(book);

	    //Tutorial Continued
	    book = new DefaultMutableTreeNode(new BookInfo
	        ("The Java Tutorial Continued: The Rest of the JDK",
	        "tutorialcont.html"));
	    category.add(book);

	    //JFC Swing Tutorial
	    book = new DefaultMutableTreeNode(new BookInfo
	        ("The JFC Swing Tutorial: A Guide to Constructing GUIs",
	        "swingtutorial.html"));
	    category.add(book);

	    //...add more books for programmers...

	    category = new DefaultMutableTreeNode("Books for Java Implementers");
	    top.add(category);

	    //VM
	    book = new DefaultMutableTreeNode(new BookInfo
	        ("The Java Virtual Machine Specification",
	         "vm.html"));
	    category.add(book);

	    //Language Spec
	    book = new DefaultMutableTreeNode(new BookInfo
	        ("The Java Language Specification",
	         "jls.html"));
	    category.add(book);
	}
*/