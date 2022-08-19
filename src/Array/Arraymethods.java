package Array;

import java.util.Arrays;
public class Arraymethods {

	public static void main(String[] args) {
		int arr1[] = new int[] { 100, 100, 300, 50, 200, 10, 45, 500, 250, 150 ,100};
		int arr2[] = new int[] {12,45,122,35,456,123,463,1323,456};
		int key = 10;
		Arrays.sort(arr1);
		System.out.println(Arrays.compare(arr1, arr2));
		System.out.println(key+" is found at position "+Arrays.binarySearch(arr1, key));
	
		int arr3[] = Arrays.copyOf(arr1, 5);
		System.out.println(Arrays.compare(arr1, arr3));
		System.out.println(Arrays.toString(arr1));
//		Arrays.fill(arr3, key);
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.mismatch(arr1, arr3));
		for (int i=0;i<arr1.length;i++) {
			int count = 0;
			for(int j=arr1[i];j<=arr1.length;j++) {
				if(arr1[i]%j==0)
					count++;
			}
			
		}
		}

}
