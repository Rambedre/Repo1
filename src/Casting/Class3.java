package Casting;

interface  Class3 {
	
	default void abc() {
		System.out.println("this is abc methd i abstract class");
	}
	abstract void asdf();
	
	static void abc1() {
		System.out.println("This is abc1 method of abstract class");
	}
	
}
