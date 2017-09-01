import java.util.Scanner;

public class color
{

  public static void main(String[] args)
  {

	Scanner user_input = new Scanner(System.in);
	System.out.println("Choose a color:Black, White, Red, Blue ");
	String color = user_input.next();

	if(color.equals("Black")) 
	{
		System.out.println("You must be beautiful cos Black is beautiful");
	}

	else if(color.equals("White"))
	{
		System.out.println("You must be an oyinbo");
	}

	else if(color.equals("Red"))
	{
		System.out.println("You definitely throw temper tantrums");
	}

	else if(color.equals("Blue"))
	{
		System.out.println("You must be a gentle Giant");
	}

	else
	{
		System.out.println("You didn't pick from any of the listed colors so i can't make any judgements about your personality");
	}

  }

}
