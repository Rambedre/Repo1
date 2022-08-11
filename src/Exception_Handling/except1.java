package Exception_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class except1 {
	int a = 100;
	int b = 22;
	int c = 0;
	static String j = "Subject";

	void Abc() {
		try {
			System.out.println(j.charAt(8));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		try {
			System.out.println(b / c);

		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());

		} finally {
			System.out.println("Can not divide any number by 0.");
		}

	}

	void pqr() throws FileNotFoundException {
		String s = "G:\\Bytree\\Lectures";
		FileInputStream file = new FileInputStream(s);
	}

	void pqr(int j) {
		String s = "G:\\Bytree\\Lectures";
		try {
			FileInputStream file = new FileInputStream(s);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		except1 o = new except1();
		o.Abc();
		o.pqr(34);
		System.out.println("The end");
		
	}
}
