package Abc;

public class Class1 {
public void Method1() {
	System.out.println("This is non Static Method");
	}
public static void Method2() {
	System.out.println("This is Static Method");
}
public class Class2{
	public static void Method3() {
		System.out.println("This is Class 2 static method");
	}
	
}
public static void main(String[] args) {
	Class1 obj = new Class1();
	obj.Method1();
	Class1.Method2();
	Class2.Method3();
	
}
}