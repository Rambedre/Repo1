package String;

public class Stringhand {
		static String a="This is Static Variable";
		String h = "This is Instance Variable";
	
	public static void main(String[] args) {
		Stringhand obj = new Stringhand();
		String ss = new String("This is Local String");
		
		System.out.println(ss.concat(" "+a));
		System.out.println(a.charAt(5));
		System.out.println(ss.equals(a));
		System.out.println(obj.h.isEmpty());
		System.out.println(a.isBlank());
		System.out.println(ss.length());
		System.out.println(a.replaceAll(a, obj.h));
		System.out.println(obj.h.replace("Instance", "Global"));
		System.out.println(ss.indent(3));
		System.out.println(a.indexOf('i'));
		System.out.println(obj.h.compareTo(ss));
		System.out.println(a.toUpperCase());
		System.out.println(ss.toLowerCase());
		System.out.println("Todays Changes");
		
		
		
}
}
