import java.util.Scanner;

public class Logic8 {
public static void main(String[] args) {
	
	int units = 0;
	int tens = 0;
	int hundreds = 0;

	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter 3 sets of 3 digit numbers");
	int alpha = scanner.nextInt(); // units
	int beta = scanner.nextInt(); // tens
	int gamma = scanner.nextInt(); //hundreds
	
	units = alpha % 10;
	tens = (beta % 100)/10;
	hundreds = (gamma % 1000)/100;
	


	if (gamma > 99) {
		hundreds = (gamma % 1000)/100; 
		
	} if (hundreds == 0){
			hundreds = 9;
	}
	if (gamma <=99)	{
		hundreds = gamma % 10;
		
		if (hundreds == 0){
			hundreds = 9;
		}
	}
	
	if (beta < 10) {
		tens = beta % 10;
}
	String output = "" + hundreds + tens + units;
	int newOutput = Integer.parseInt(output);
	System.out.println(newOutput);
	}
}

