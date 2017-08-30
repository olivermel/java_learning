//package userinput;
//import javax.swing.JOptionPane;
//
//
import javax.swing.*;

public class InputBoxes 
{

  public static void main(String[] args) 
  {

	String first_name;
	first_name = JOptionPane.showInputDialog("First Name", "Enter your First Name");
	
	String family_name;
	family_name = JOptionPane.showInputDialog("Last Name", "Enter your Family Name");

	String full_name;
	full_name = "You are " + first_name + " " + family_name;

	//JOptionPane.showMessageDialog(null, full_name);
	JOptionPane.showMessageDialog(null, full_name, "Name", JOptionPane.INFORMATION_MESSAGE);



	
	System.exit(0);	
 
   }

} 
