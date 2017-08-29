import java.util.Scanner;

public class gettinguserinput1 {

   public static void main(String[] arg) {

	// Create scanner object
	Scanner input = new Scanner(System.in);

	// Output a prompt
	System.out.println("Enter an integer: ");

	// Wait for user to enter a prompt
	int value = input.nextInt();

	//Tell them what they entered
	System.out.println("You entered: " + value);

   }

}
