package Encaps;

public class Bill {

	
	
	public static void main(String[] args) {
		Eps o = new Eps();
		o.setRollno(99);
		o.setEnrollno(10220123);
		o.setStuname("Ram");
		o.setMarks(87);
		
		System.out.println(o.getEnrollno());
		System.out.println(o.getRollno());
		System.out.println(o.getStuname());
		System.out.println(o.getMarks());
	
	}
}
