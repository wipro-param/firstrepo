import java.util.Scanner;


public class Part10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number .. ");
		String num1 = scanner.next();
		int palindrome = Integer.parseInt(num1);
		
		if(isPalindrome(palindrome)) {
			System.out.println(palindrome + " is a palindrome"); //print whether palindrome exists or not
		} else {
			System.out.println(palindrome + " is not a palindrome");
		}
		
	}
	
	public static boolean isPalindrome(int number){
		int palindrome = number;
		int reverse = 0;
		
		while (palindrome != 0){
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		
		// check to see whether number typed is same as reverse which means its a palindrome
		
		if (number == reverse) {
			return true;
		}
		return false;
	}

}
