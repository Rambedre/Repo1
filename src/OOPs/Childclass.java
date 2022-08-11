package OOPs;

public class Childclass extends Parentclass{
	int a =10;
	int b =20;
	static int x = 30;
	static int y = 40;
	
	void method1() {
		super.method1();
		
		System.out.println("This is Method 1 in child class ");
	}
	void method2() {
		super.method2();
		this.method1();
		System.out.println("This is Method 2 in child class ");
	}
	void method3() {
		super.method3();
		this.method2();
		System.out.println("This is Method 3 in child class ");
	}
	void method4() {
		super.method4();
		this.method3();
		System.out.println("This is Method 4 in child class ");
	}
	Childclass(){
		super();
		int t = this.a+super.b;
		int s = super.x-y;
		System.out.println(t);
		System.out.println(s);
	}
	
	Childclass(int a,int x){
		this();
		System.out.println("Super keyword used to call parent class variaables:");
		System.out.println(super.a+" "+super.b);
	}
	
	public static void main(String[] args) {
		System.out.println("Super Keyword used to invoke immediate parent classconstructor: ");
		Childclass o = new Childclass(1,2);
		System.out.println("Super Keyword used to invoke immediate parent Method: ");
		o.method4();
	}
}
