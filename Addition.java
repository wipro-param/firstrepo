import java.util.Scanner;


public class Addition {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("enter two numbers");
		 
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();


		 System.out.println("the sum of " + a + " and " + b + " is " + (a+b));
	}

}
