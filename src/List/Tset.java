package List;
import java.util.Set;
import java.util.TreeSet;
public class Tset {
	public static void main(String[] args) {
		Set tt = new TreeSet();
		tt.add(100);
		tt.add(500);
		tt.add(50);
		tt.add(200);
		tt.add(900);
		tt.add(400);
		
		Set tt1 = new TreeSet();
		tt1.add("John");
		tt1.add("Robin");
		tt1.add("Adam");
		tt1.add("Ali");
		tt1.add("Chris");
		tt1.add("Jad");
		tt1.add("Bob");
		
		for (Object i:tt) {
			System.out.println(i);
		}
		System.out.println(" ");
		for(Object j:tt1) {
			System.out.println(j);
		}
	}
}
