

public class Box{
	double width;
	double height;
	double depth;
	double volume;



public double getVolume(double width, double height, double depth) { //passing values through parameters
	
	return width * height * depth; // returning calculation
}


public static void main(String[] args) {
 Box b1 = new Box();
 System.out.println(b1.getVolume(2.3, 3.1, 4.0));
}
}
