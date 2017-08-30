public class nestedifs
{   
  public static void main(String[] args)
  {

	int user = 45;

	if (user < 19) {
		System.out.println("This person is 18 or younger");
	}
	
	else if (user > 19 && user < 45) {
		System.out.println("This user is between 18 and 44");
	}

	else {
		System.out.println("This user is definitely older than 44");
	}
  }

}
