package Interphase;

abstract class BaseAbs implements Base1{
	
	public int x = 100;
	int xx = 200;
	private int a;
	private int b;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void Abc() {
		System.out.println("This is public method");
	}
	protected void Abc(int i){
		System.out.println("This s protected method");
	}
	void Abc(float b) {
		System.out.println("This is default method");
	}
	private void Abc(double d) {
		System.out.println("This is Private method");
	}
	
	abstract void ASD();
	public static void main(String[] args) {
		Base1.metod1();
		
	}
}
