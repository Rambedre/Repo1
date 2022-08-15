package Array;

public class FindDuplicate {
	
	static void intarr() {
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
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					System.out.println(arr1[j]);
				}
			}
		}
	}
	
	static void chararr() {
		String arr1[];
		arr1=new String[5];
		arr1[0]="Mark";
		arr1[1]="Mark";
		arr1[2]="Chris";
		arr1[3]="Robert";
		arr1[4]="Brian";
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++){
				if(arr1[i].equals(arr1[j]))
					System.out.println(arr1[j]);
			}
		}
	
		
		
	}

	public static void main(String[] args) {
	chararr();
	intarr();
	}

}
