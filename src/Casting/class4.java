package Casting;

public class class4 implements Class3 {

	@Override
	public void asdf() {
		System.out.println("This is abstracct method asdf");
		
	}
	public void abc() {
		System.out.println("this is abc methd of child class");
	}
	
	public static void main(String[] args) {
		Class3 o= new class4();
		o.asdf();
		o.abc();

	}
}
