package Casting;

public class Class1 {
	int x = 100;
	float j = 12.4f;
	
	void Abc() {
		System.out.println("This is Abc method of parent class");
	}
	
	static void pqr() {
		System.out.println("this is pqr method of parent class");
	}
	void pqr1() {
		System.out.println("This is pqr1 method of parent class");
	}
	void qwer() {
		System.out.println("This is qwer method");
	}
	public static void main(String[] args) {
		float  i = 10;
		double j = i;
		long x = 1237;
		int y = (int)x;
		System.out.println(j);
		System.out.println(y);
		
		
	}
}
