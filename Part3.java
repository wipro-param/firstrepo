
public class Part3 {

	public static void main(String[] args) {


		
		String a = args[0]; // putting first element of argument into string a
		String b = args[1]; // putting second element of argument into string b
		String reverse = new StringBuffer(b).reverse().toString();

			
		
		System.out.println("Your two combined strings are " + a + " " + reverse);
	}
	
}
