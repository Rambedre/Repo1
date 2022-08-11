package Abc;

public class Variables {
	int x = 2;
	int z;
	static int y = 4;
	static int xx;
	public static void local_var(){
		int a=10;
		System.out.println("Local Var"+a+"*"+"Static var"+y+"="+a*y);
	}
	public void locvar2() {
		int a=100;
		System.out.println("Local var"+a+"Non Static var"+"x"+"static var"+y+"="+a*x*y);
	}
	public static void main(String[] args) {
	Variables.local_var();
	Variables obj = new Variables();
			obj.locvar2();
}
}
