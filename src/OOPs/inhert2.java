package OOPs;

public class inhert2 {
	static int i = 10;
	static int j = 20;
	
	static void method(){
	int a = 100;
	int b = 200;
	int c = a+b;
	System.out.println("This is Static Method");
	System.out.println(c);
		}
	void method2() {
	this.method();
	System.out.println("This is Non Static Method");
	}
	
	public static void main(String[] args) {
	inhert2 obj = new inhert2();
	obj.method2();
	}
}
