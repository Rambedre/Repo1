package Interphase;

public class Baseclass implements Interphaseparent,Interphaseparent2 {

	@Override
	public void calculator() {
		int add = aa+bb;
		int sub = dd-cc;
		int mul = bb*cc;
		float div = dd/bb;
		System.out.println("This is calculator Method");
		System.out.println("Addition \t"+aa+"+"+bb+"="+add);
		System.out.println("Subtraction \t"+cc+"-"+dd+"="+sub);
		System.out.println("Multiplication \t"+bb+"*"+cc+"="+mul);
		System.out.println("Dividion \t"+dd+"/"+bb+"="+div);
	}

	
	@Override
	public void marksheet() {
		int total = i+j+c;
		double per = (total*100)/300;
		
		System.out.println("*****************************");
		System.out.println("\t Marksheet \t");
		System.out.println("Name of Student:\t"+s);
		System.out.println("Year:\t\t 1st year");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Name of subjects"+"\t"+"Marks");
		System.out.println("------------------------------");
		System.out.println(C+"\t\t"+i+"\n"+E+"\t\t"+j+"\n"+M+"\t\t"+c);
		System.out.println("------------------------------");
		System.out.println("Total"+"\t\t\t"+total);
		System.out.println("Percentage"+"\t\t"+per);
		System.out.println("*****************************");
		
	}

	

}
