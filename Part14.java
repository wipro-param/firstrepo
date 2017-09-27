import java.util.Objects;
import java.util.Scanner;


public class Part14 
{

	public static void main(String[] args) 
	{
		
		//declaring and intilizing the array
		int[] arrList = {4,566,76,32,12,8,6};
		
		int position = 0;
		boolean myCheck = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check if in array..");
		int num1 = scanner.nextInt();
		
		for (int index = 0; index < arrList.length-1; index++)
		{
			if(Objects.equals(num1,arrList[index])) 
			{
				position = index;
				System.out.println("here pos " + position);
				myCheck = true;
			}
			if(!myCheck)
			{				
				System.out.println("-1");
			}
				
		}

	}

}
