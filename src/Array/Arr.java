package Array;

public class Arr {
		static String Array[]= {"John", "Devid", "Ben", "Carl", "Robert"};
		static int Array1[]= {200,400,600,300,500};
		static int Array2[]= {450,213,345,567,342};
		
	public static void main(String[] args) {
		
		int Arr1[];
		Arr1 = new int[5];
		Arr1[0]=100;
		Arr1[1]=200;
		Arr1[2]=300;
		Arr1[3]=400;
		Arr1[4]=500;
		
		
		for(int i:Arr1) {
			System.out.println(i);
		}
		System.out.println("");
		for(int j:Array2){
			System.out.println(j);
		}
		System.out.println("");
		for(int i =0;i<Array.length;i++) {
			System.out.println(Array[i]);
		}
	}
	
}
