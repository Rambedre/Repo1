package Practice;


public class pqr {
	static int i =0;	
//	static void revdo() {
//		int i =0;
//		int j;
//		int n = 123321123;
//		int nn = n;
//		while(n>0) {
//			j = n%10;
//			i = (i*10)+j;
//			n=n/10;
//		}
//		if (i==nn) {
//			System.out.println("is pallendrom");
//		}
//		else {
//			System.out.println("is not pallendrom");
//		}
//	}
	
	static int revif(int n) {
		
		int j;
		
		if(n<=0) {
			j = n%10;
			i = (i*10)+j;
			n=n/10;
		}
		return i;
	}
	public static void main(String[] args) {
		int n = 12324;
		System.out.println(revif(n));
		
	}
	}
	
	

