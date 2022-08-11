package List;

import java.util.ArrayList;
import java.util.List;

public class Listclass {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(100);
		list.add(100);
		list.add(" ");
		list.add("Java");
		list.add(" ");
		list.add(200);
		list.add(23.4f);
		
		System.out.println("This is Array List");
		for(Object o:list) {
			System.out.println(o);
			}
		System.out.println(list);
		list.add(2,34);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.set(3,123));
		System.out.println(list);
	}
}
