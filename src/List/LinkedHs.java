package List;
import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHs {
 public static void main(String[] args) {
	Set lhs = new LinkedHashSet();
	lhs.add(100);
	lhs.add(100);
	lhs.add(" ");
	lhs.add("Java");
	lhs.add(" ");
	lhs.add(23.4f);
	
	System.out.println(lhs);
	System.out.println(lhs.add(200)+"\t"+lhs);
	System.out.println(lhs.size());
	System.out.println(lhs.remove(100)+"\t"+lhs);
	System.out.println(lhs.isEmpty());
}
}
