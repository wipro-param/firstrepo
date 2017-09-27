import java.util.Scanner;


public class Part8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("What gender are you? ");
		String gender = s.next();
		System.out.print("What age are you? ");
		int age = s.nextInt();
		
	//	if ((gender != "male") || (gender != "female")) {
		//	System.out.println("that gender does not exist");
	//	}
		
		//	System.out.println("You are " + gender + " and " + age + " years old");

		
		 if ((gender == "female") && (age > 1 && age < 58 )) {
			System.out.println("Your interest rate is 8.2%");
		}
	}

}
