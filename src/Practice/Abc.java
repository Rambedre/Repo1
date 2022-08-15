package Practice;


public class Abc {
	
	public static void main(String[] args) {
		int arr1[];
		arr1 = new int[10];
		arr1[0]=100;
		arr1[1]=100;
		arr1[2]=200;
		arr1[3]=200;
		arr1[4]=500;
		arr1[5]=100;
		arr1[6]=200;
		arr1[7]=400;
		arr1[8]=800;
		arr1[9]=300;
		int temp = 0;
		for (int i =0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				
				if(arr1[i]>arr1[j]) {
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
			System.out.println(temp);
		}
	
	}
	
}
