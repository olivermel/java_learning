import java.util.Scanner;

public class gettinguserinput {

   public static void main(String[] arg) {

	// Create scanner object
	Scanner input = new Scanner(System.in);

	// Output a prompt
	System.out.println("Enter a line of text: ");

	// Wait for user to enter a prompt
	String line = input.nextLine();

	//Tell them what they entered
	System.out.println("You entered a line: " + line);

   }

}
