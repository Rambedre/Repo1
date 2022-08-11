package Interphase;

public class implementation extends BaseAbs {

	public void Abc() {
		System.out.println("This is public method in normal class");
	}

	protected void Abc(int i) {
		System.out.println("This s protected method in normal class");
	}

	void Abc(float b) {
		System.out.println("This is default method in normal class");
	}
	@Override
	public void Abcs() {
		System.out.println("This is method in Interphase ");
	}
	@Override
	void ASD() {
		System.out.println("This is method in Abstract class");

	}

	public static void main(String[] args) {
		implementation o = new implementation();
		o.setA(10);
		System.out.println(o.getA());
		o.method1(23);
		o.Abc();
		o.Abc(23);
		o.Abc(23.45f);
		o.Abcs();
		o.ASD();
		
	}
}
