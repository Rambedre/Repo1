package Modifiers;

public class FinChild extends Finalkey  {
	
	public void Abc(int i) {
		System.out.println("This is Public method of FinChild class");
		System.out.print("Public variable: "+ a +"\t");
		System.out.println("Public Static Variable: "+aa);
		System.out.print("Protected variable: "+ b+"\t");
		System.out.println("Protected Static Variable: "+bb);
		System.out.print("Default variable: "+ c+"\t");
		System.out.println("Default Static Variable: "+cc);
		
		System.out.print("Final variable: "+ e+"\t");
		System.out.println("Final Static Variable: "+ee);
		Finalkey o = new Finalkey();
		o.Method1();
		o.Method2();
		o.Method3();
		System.out.println("\n");
	}
	
	protected void Abc(float j) {
		System.out.println("This is protected method of FinChild class");
		System.out.print("Public variable: "+ a +"\t");
		System.out.println("Public Static Variable: "+aa);
		System.out.print("Protected variable: "+ b+"\t");
		System.out.println("Protected Static Variable: "+bb);
		System.out.print("Default variable: "+ c+"\t");
		System.out.println("Default Static Variable: "+cc);
		
		System.out.print("Final variable: "+ e+"\t");
		System.out.println("Final Static Variable: "+ee);
		Finalkey o = new Finalkey();
		o.Method1();
		o.Method2();
		o.Method3();
		System.out.println("\n");
	}
	void Abc(char k) {
		System.out.println("This is Default method of FinChild class");
		System.out.print("Public variable: "+ a +"\t");
		System.out.println("Public Static Variable: "+aa);
		System.out.print("Protected variable: "+ b+"\t");
		System.out.println("Protected Static Variable: "+bb);
		System.out.print("Default variable: "+ c+"\t");
		System.out.println("Default Static Variable: "+cc);
		
		System.out.print("Final variable: "+ e+"\t");
		System.out.println("Final Static Variable: "+ee);
		Finalkey o = new Finalkey();
		o.Method1();
		o.Method2();
		o.Method3();
		System.out.println("\n");
	}
	
	private void Method11(){
		System.out.println("This is Private method of FinChild class");
		System.out.print("Public variable: "+ a +"\t");
		System.out.println("Public Static Variable: "+aa);
		System.out.print("Protected variable: "+ b+"\t");
		System.out.println("Protected Static Variable: "+bb);
		System.out.print("Default variable: "+ c+"\t");
		System.out.println("Default Static Variable: "+cc);
		
		System.out.print("Final variable: "+ e+"\t");
		System.out.println("Final Static Variable: "+ee);
		Finalkey o = new Finalkey();
		o.Method1();
		o.Method2();
		o.Method3();
		System.out.println("\n");
	}
	public static void main(String[] args) {
		FinChild o = new FinChild();
		o.Abc(12);
		o.Abc(23f);
		o.Abc('a');
		o.Method11();
		
		
	}
		
	}

