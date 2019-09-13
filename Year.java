import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Year extends JFrame implements ActionListener{
	JTextField tf1,tf2;
	  JButton btn;
	  
	  Year()
	  {
	    setLayout(new FlowLayout());
	    add(tf1=new JTextField(20));
	    add(btn=new JButton("Check"));
	    add(tf2=new JTextField(20));
	    tf2.setEditable(false);
	    btn.addActionListener(this);
	    setSize(250,250); setVisible(true);
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    getContentPane().setBackground(Color.YELLOW);
	  }
	  public void actionPerformed(ActionEvent e)
	   {
	     int x=0;
	     String z="";
	     x = Integer.parseInt(tf1.getText());
	    
	     if (((x % 4 == 0) && (x % 100!= 0)) || (x%400 == 0))
	     z = "leap year";
	     else
	     z = "Not a leap year";
	     
	    tf2.setText(z.toString());
	   }
	  public static void main(String args[])
	  {
	    new Year();
	  }
}
