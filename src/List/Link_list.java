package List;

import java.util.LinkedList;
import java.util.List;

public class Link_list {
	public static void main(String[] args) {
		List ll = new LinkedList();
		ll.add(100);
		ll.add(100);
		ll.add(" ");
		ll.add("Java");
		ll.add(" ");
		ll.add(200);
		ll.add(23.4f);
		
		System.out.println(ll);
		ll.remove(4);
		System.out.println(ll);
		ll.add(3,"er");
		System.out.println(ll);
		System.out.println(ll.get(5));
		System.out.println(ll.set(1, "101"));
		System.out.println(ll);
	}
}
