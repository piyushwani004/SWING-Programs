
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   A frame with a text area and buttons for text editing
*/
class Program7 extends JFrame
{
   private JTextArea textArea;
   private JScrollPane scrollPane;
   private JPanel buttonPanel;
   private JButton wrapButton;
 public Program7()
   {
      setTitle("TextAreaTest");
      setSize(300,200);
       buttonPanel = new JPanel();

 	 JButton insertButton = new JButton("Insert");
      buttonPanel.add(insertButton);
      insertButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               textArea.append("The quick brown fox "
                  + "jumps over the lazy dog. ");
            }
         });
      // add button to turn line wrapping on and off
      wrapButton = new JButton("Wrap");
      buttonPanel.add(wrapButton);
      wrapButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent evt)
            {
               boolean wrap = !textArea.getLineWrap();
               textArea.setLineWrap(wrap);
           //    scrollPane.validate();
               wrapButton.setText(wrap ? "No Wrap" : "Wrap");
            }
         });
    add(buttonPanel, BorderLayout.SOUTH);
    // add a text area with scroll bars

      textArea = new JTextArea(8, 40);
      textArea.setEditable(false);

      scrollPane = new JScrollPane(textArea);
      add(scrollPane, BorderLayout.CENTER);
   }
   public static void main(String [] args)
   {
	   Program7 f = new Program7();
	   f.setDefaultCloseOperation(3);
	   f.setVisible(true);
   }

}
