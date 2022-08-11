package Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Abc {
	int a;
	static int b;
	public static void main(String[] args) {
		List l1 = new ArrayList();
		List l2 = new LinkedList();
		
		l1.add("Ram");
		l1.add("Ram");
		l1.add("");
		l1.add(23);
		l1.add("");
		l1.add(23.3f);
		l1.add(0, 1234);
		
		for (Object o:l1) {
			System.out.println(o);
		}
		System.out.println("_________________________________-");
		l2.add("Java");
		l2.add("Java");
		l2.add("234");
		l2.add("");
		l2.add("");
		l2.add(2314);
		l2.add(23.45f);
		l2.add(0, "This");
		for(Object o1:l2) {
			System.out.println(o1);
			
		}
		System.out.println("This is modified in github");
	}
	
	
	
	
}
