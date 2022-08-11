package Abc;

public class whiebreakandcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Do While with Continue Statement");
int a=1;
while (a<=10) {
	if (a==4) {
		a++;
		continue;
	}
	System.out.println(a);
	a++;
		}
System.out.println("Do While with brak Statement");
int b=1;
while (b<=10) {
	if (b==4) {
		
		break;
	}
	System.out.println(b);
	b++;
		}

	}
	
}
