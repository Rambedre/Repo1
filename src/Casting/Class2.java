package Casting;

public class Class2 extends Class1{
	static int x = 23;
	static int j = 345;
	static float z = 32f;
	char s = 'd';
	void Abc() {
		System.out.println("This is Abc method of child class");
	}
	
	void pqr1() {
		System.out.println("This is pqr1 method of child class");
	}
	static void xyz() {
		System.out.println("This is xyz method of child class");
	}

	public static void main(String[] args) {
		Class1 o = new Class2();
		o.Abc();
		Class1 o1 = (Class1)o;
		o1.qwer();
	}
}
