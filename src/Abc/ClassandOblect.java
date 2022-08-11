package Abc;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ClassandOblect {		//Class Name
	
	int a=10;						//NonStatic
	float b=12.5f;
	String nm="Ram";
	char bb='g';
	byte c=124;
	short d=1000;
	double e=13.1324;
	boolean f=true;
	int x=1000;
	int y=200;
	int Add=x+y;
	int Sub=x-y;
	int M=x*y;
	int Div=x/y;

	public static void main(String[] args) {
		ClassandOblect o= new ClassandOblect();		//Object
		
		System.out.println(o.a);
		System.out.println(o.b);
		System.out.println(o.nm);
		System.out.println(o.bb);
		
		System.out.println(o.x);
		System.out.println(o.y);
		System.out.println(o.Add);
		System.out.println(o.Sub);
		System.out.println(o.M);
		System.out.println(o.Div);
		
	

	}

}
