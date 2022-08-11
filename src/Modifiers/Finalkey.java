package Modifiers;

public class Finalkey {
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	final int e = 50;
	
	public static int aa = 100;
	protected static int bb = 200;
	static int cc = 400;
	private static int dd = 500;
	static final int ee = 600;
	
	public void Abc(int i) {
		System.out.println("This is Public method of Finalkey class");
		System.out.println("\n");
	}
	
	protected void Abc(float j) {
		System.out.println("This is protected method of Finalkey class");
		System.out.println("\n");
	}
	void Abc(char k) {
		System.out.println("This is Default method of Finalkey class");
		System.out.println("\n");
	}
	private void Abc(int h, int j) {
		System.out.println("This is Private method of Finalkey class");
		System.out.println("\n");
	}
	
	public static void Abc1(int i) {
		System.out.println("This is Public static method of Finalkey class");
		System.out.println("\n");
	}
	protected static void Abc1(float j) {
		System.out.println("This is protected static method of Finalkey class");
		System.out.println("\n");
	}
	static void Abc1(char k) {
		System.out.println("This is default static method of Finalkey class");
		System.out.println("\n");
	}
	private static void Abc1(int i, int j) {
		System.out.println("This is Private static method of Finalkey class");
		System.out.println("\n");
	}
	
	final static void Abc2() {
		System.out.println("This is final method");
	}
	
	final static void Abc2(int i) {
		
		System.out.println("This is overloaded final method");
	}
	
	public void Method1() {
		System.out.println("Public method in Finalkey class");
	}
	protected void Method2() {
		System.out.println("Protected method in Finalkey class");
	}
	void Method3() {
		System.out.println("Default method in Finalkey class");
		}
	private void Method4() {
		System.out.println(d+"**********************"+dd);
	}
	public static void main(String[] args) {
		Finalkey o = new Finalkey();
		o.Abc(1);
		o.Abc(34f);
		o.Abc('c');
		o.Abc(2,5);
		Abc1(1);
		Abc1('c');
		Abc1(23f);
		Abc1(23,45);
		Abc2();
		Abc2(3);
		o.Method4();
	}
}
