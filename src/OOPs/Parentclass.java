package OOPs;

public class Parentclass {
	int a =100;
	int b =200;
	static int x = 300;
	static int y = 200;
	void method1() {
		
		System.out.println("This is Method 1 in parent class");
	}
	void method2() {
		
		System.out.println("This is Method 2 in parent class");
	}
	void method3() {
		
		System.out.println("This is Method 3 in parent class");
	}
	void method4() {
		
		System.out.println("This is Method 4 in parent class");
	}
	
	Parentclass(){
		int t = a+b;
		int s = x-y;
		System.out.println(t);
		System.out.println(s);
	}
public static void main(String[] args) {
	
}
}

