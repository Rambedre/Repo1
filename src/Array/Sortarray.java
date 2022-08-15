package Array;

public class Sortarray {

	static void intarr() {

		int arr1[] = new int[] { 100, 100, 300, 50, 200, 10, 45, 500, 250, 150 };
		
		for (int i = 0; i < arr1.length; i++)
		{
		for (int j = i + 1; j < arr1.length; j++)
		{
		int temp = 0;
		if (arr1[i] < arr1[j])
		{
		temp = arr1[i];
		arr1[i] = arr1[j];
		arr1[j] = temp;
		}
		}
		System.out.println(arr1[i]);
		
		}
		
	}

	public static void main(String[] args) {
		intarr();

	}

}
