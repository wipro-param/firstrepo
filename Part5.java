import java.util.Scanner;


public class Part5 {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("enter a number");
		 
		 int a = scanner.nextInt();

		 if (a == 0){

		 System.out.println("You have entered zero ");
		 }
		 
		 else if (a > 0) {
			 System.out.println("You have entered a postive number");
		 }
		 
		 else if (a < 0){
			 System.out.println("You have entered a negative number");
		 }
		 }

}