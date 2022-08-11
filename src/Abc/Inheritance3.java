package Abc;

public class Inheritance3 extends inheritance2 {
	
	static int Total = a+b+aa+bb;
	
	public static void main(String[] args) {
		System.out.println("This is child class 2");
		Inheritance obj = new Inheritance();
		obj.method();
		System.out.println(Total);
		inheritance2 obj2 = new inheritance2();
		obj2.method2();
		System.out.println(a);
	}
	
}
