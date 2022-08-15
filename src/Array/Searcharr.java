package Array;

public class Searcharr {

	public static void main(String[] args) {
		int x=100;
		
		int arr1[] = new int[] { 100, 100, 300, 50, 200, 10, 45, 500, 250, 150 ,100};
		for(int i=0;i<arr1.length;i++) {
			
			if(arr1[i]==x) {
				System.out.println(x+"is at position"+i);
			}
			
		}
	}

}
