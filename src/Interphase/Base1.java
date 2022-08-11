package Interphase;

public interface Base1 {
	
	public int a=10;
	int b = 20;
	
	
	
	
	public static void metod1() {
		System.out.println("This is Static method in intrphase");
	}
	default void method1(int i) {
	   System.out.println("This is Defaut method in interphase");
	}
	private void method11(float j) {
		System.out.println("This is Protected Method");
	}
	public static void metod1(int i ) {
		System.out.println("This is Static method in intrphase");
	}
	default void method1(int i, int j) {
	   System.out.println("This is Defaut method in interphase");
	}
	private void method11(float j, char s) {
		System.out.println("This is Protected Method");
	}
	
	
	abstract void Abcs();
	
}
