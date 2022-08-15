package Array;

public class Larestnoinarray {

	public static void main(String[] args) {
		int arr1[] = new int[] { 100, 100, 300, 50, 200, 10, 45, 500, 250, 150 ,100};
		int max = 0;
		for (int i=0;i<arr1.length;i++) {
			if(arr1[i]>max) {
				max = arr1[i];
			}
		}
		System.out.println("Largest number is: "+max);
		
		
		
	}

}
