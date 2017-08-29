public class ifwhilebreak {

   public static void main(String[] arg) {

      int loop = 0;

      while(loop < 5) {

	System.out.println("Looping: " + loop);
	
	if(loop == 5) {
	    break;
	}  

	loop++;
	System.out.println("Running");

      }

   }

}
