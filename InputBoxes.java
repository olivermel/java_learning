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
	first_name = JOptionPane.showInputDialog("First Name");
	
	String family_name;
	family_name = JOptionPane.showInputDialog("Family Name");

	String full_name;
	full_name = "You are " + first_name + " " + family_name;

	JOptionPane.showMessageDialog(null, full_name);
	
	System.exit(0);	
 
   }

} 
