package OOPs;

import Modifiers.Finalkey;

public class Demo extends Finalkey{
	public void DC() {
		
		System.out.println("This is Public method of Demo class");
		System.out.print("Public variable: "+ a +"\t");
		System.out.println("Public Static Variable: "+aa);
		System.out.print("Protected variable: "+ b+"\t");
		System.out.println("Protected Static Variable: "+bb);
		System.out.println("**********************************");
		Abc(1);
		Abc(23.6f);
		Abc1(23);
		Abc1(23.5f);
		System.out.println("**********************************");
		
	}
	protected void DC(int i) {
		System.out.println("This is Protected method of Demo class");
		System.out.print("Public variable: "+ a +"\t");
		System.out.println("Public Static Variable: "+aa);
		System.out.print("Protected variable: "+ b+"\t");
		System.out.println("Protected Static Variable: "+bb);
		System.out.println("**********************************");
		Abc(1);
		Abc(23.6f);
		Abc1(23);
		Abc1(23.5f);
		System.out.println("**********************************");
	}

	void DC(float f) {
		System.out.println("This is Protected method of Demo class");
		System.out.print("Public variable: "+ a +"\t");
		System.out.println("Public Static Variable: "+aa);
		System.out.print("Protected variable: "+ b+"\t");
		System.out.println("Protected Static Variable: "+bb);
		System.out.println("**********************************");
		Abc(1);
		Abc(23.6f);
		Abc1(23);
		Abc1(23.5f);
		System.out.println("**********************************");
	}
	
	private void DC(int i, int j) {
		System.out.println("This is Private method of Demo class");
		System.out.print("Public variable: "+ a +"\t");
		System.out.println("Public Static Variable: "+aa);
		System.out.print("Protected variable: "+ b+"\t");
		System.out.println("Protected Static Variable: "+bb);
		System.out.println("**********************************");
		Abc(1);
		Abc(23.6f);
		Abc1(23);
		Abc1(23.5f);
		System.out.println("**********************************");
	}
public static void main(String[] args) {
	Demo d = new Demo();
	d.DC();
	d.DC(2);
	d.DC(23f);
	d.DC(23, 32);
}
}

