
public class Test1 {

	public static void main(String[] args) {

		
		int input1 = 5;
		int input2[]= {1,3,7,2,1};
		int counter = 1;
		int output1 = 1;
		int x = 0;

		
		
		
			for (int i=1; i < input2.length; i++){
				if (input2[i] >= input2[i-1]) {
					counter++;
				}		else {
					counter = 1;

				}
				
				if (counter > output1) {
					output1 = counter;
		
				}
				}
			System.out.println(output1);
	}
}
	
			

	


