import javax.swing.*;

public class recfloat
{
  public static void main(String[] args) 
  {

	String breadth = JOptionPane.showInputDialog("Rectangle Breadth");
	String height  = JOptionPane.showInputDialog("Rectangle Height");

	float area       = Float.parseFloat(breadth) * Float.parseFloat(height);

	JOptionPane.showMessageDialog(null, "Area=" + area,"",
	JOptionPane.WARNING_MESSAGE);

	System.exit(0);
  }

}
