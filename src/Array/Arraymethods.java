package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Arraymethods {

	public static void main(String[] args) {
		int arr1[] = new int[] { 100, 100, 300, 50, 200, 10, 45, 500, 250, 150 ,100};
		int arr2[] = new int[] {12,45,122,35,456,123,463,1323,456};
		
		String A1 = Arrays.toString(arr1);
		System.out.println(A1);
		
		ArrayList A2 = new ArrayList(Arrays.asList(arr1));
		boolean b = Arrays.asList(arr1).contains(50);
		System.out.println(b);

	}

}
