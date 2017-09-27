
public class Parent {

	Parent(){
		System.out.println("Parent");
	}
}

class Child extends Parent {
	Child()
	{
	
		this("John");
		
		System.out.println("Child");
	}
	Child(String name) {
		System.out.println(name);
	}
}
