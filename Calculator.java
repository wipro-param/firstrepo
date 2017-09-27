
public class Calculator {
	
	int num1; // power
	int num2; // base
	

	public int powerInt(int num1,int num2){
		return (int) Math.pow(num1, num2);
	}
	
	public int powerDouble(double num1,int num2){ //accepts datatype double and int
		return (int) Math.pow(num1, num2);
	}
	
	public static void main(String[] args) {
		Calculator p1 = new Calculator();
		System.out.println(p1.powerInt(1, 10));
		System.out.println(p1.powerDouble(10, 20));
	}
}



