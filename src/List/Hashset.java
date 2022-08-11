package List;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
	public static void main(String[] args) {
		Set hs = new HashSet();
		hs.add(100);
		hs.add(100);
		hs.add(" ");
		hs.add("Java");
		hs.add(" ");
		hs.add(32.4f);
		
		System.out.println(hs);
		System.out.println(hs.size());
		hs.add(3);
		System.out.println(hs.remove(100)+""+hs);
	}
}
