import javax.swing.*;

public class recsize
{
  public static void main(String[] args) 
  {

	String breadth = JOptionPane.showInputDialog("Rectangle Breadth");
	String height  = JOptionPane.showInputDialog("Rectangle Height");

	int area       = Integer.parseInt(breadth) * Integer.parseInt(height);

	JOptionPane.showMessageDialog(null, "Area=" + area,"",
	JOptionPane.WARNING_MESSAGE);

	System.exit(0);
  }

}
