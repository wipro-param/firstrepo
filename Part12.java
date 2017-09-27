import java.util.Scanner;


public class Part12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type in one of the following:"
				+ " 1) Add ... 2) Sub ... ");
		String choice = scanner.next();
		
		System.out.println("Please type in the two numbers");
		int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 
		 if (choice.equals("add")){
			 System.out.println("the sum of " + a + " + " + b + " is " + (a+b));
		 }
		 if (choice.equals("sub")){
			 System.out.println("the sum of " + a + " - " + b + " is " + (a-b));
		 }
				String end = scanner.next();
				if(end.equals("y")){
					// need to now send it back to the main menu .. unsure on how to do this
				}

		 }

	}


