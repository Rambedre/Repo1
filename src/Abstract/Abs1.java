package Abstract;


public class Abs1 extends Abs  {

	@Override
	void Nameofstud() {
		System.out.println("Name of students is :");
		System.out.println("Ram Bedre");
		System.out.println("Piyush Pathak");
		System.out.println("Akash Karale");
		System.out.println("Shrivardan Guladhe");
		System.out.println("");
	}

	@Override
	void subject() {
		System.out.println("Name of Subjects is :");
		System.out.println("Computer science");
		System.out.println("Mathematics");
		System.out.println("Electronics");
		System.out.println("");
	}
	
	@Override
	void Pname() {
		System.out.println("Name of Professors");
		System.out.println("Prof. Akash");
		System.out.println("Prof. Shubham");
	}

	
	public static void main(String[] args) {
	Abs1 o = new Abs1();
	o.Nameofstud();
	o.subject();
	o.Pname();
}


	
}
