import java.util.Scanner;


public class Part6 {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("enter two numbers");
		 
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();

		 for (int i = a; i <= b; i++) {
			    if ( i % 2 == 1) {
			  //  System.out.println("you found odd");
			    } else {
			    System.out.println("the even numbers are " + i);
			    }
			}
			return /*what you found*/;
		 
	}

}
