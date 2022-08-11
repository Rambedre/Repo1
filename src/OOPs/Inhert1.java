package OOPs; //This keyword used to refer current class instance variable
			  //This keyword used to invoke current class constructor
			  //This keyword used to invoke current class method
public class Inhert1 extends inhert2 {
	static int num1 = 100;
	static int num2 = 200;
	int num3 = 300;
	int num4 = 400;
	
	Inhert1() {
	int num1 = 10;
	int num3 = 20;
	System.out.println("This is non parameterised constructor");
	System.out.println("Static Variable used is = "+this.num1);
	System.out.println("Non Static Variable used is = "+this.num3);
	System.out.println("Local Variable used are = "+num1+" & "+num3);
	
	}
	
	Inhert1(int num2, int num4){
	this();
	int z = num2+num4;
	System.out.println("                                     ");
	System.out.println("This is parameterised constructor ");
	System.out.println("Local Variable used are = "+num2+" & "+num4);
	System.out.println("Static and non static variables ="+this.num2+" & "+this.num4);
	}
	
	Inhert1(int num1, int num2, int num3) {
	this(20,30);
	int num4 = num1+num2+num3;
	System.out.println("                                     ");
	System.out.println("This is parameterised constructor "+ num4);	
	}
	
	public static void main(String[] args) {
	Inhert1 obj = new Inhert1(100,200,300);
	inhert2 obj2 =new inhert2();
	obj2.method2();	
	}
}
