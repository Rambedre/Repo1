package Encaps;

public class Practice {
	private int i;
	private int j;
	private String n;
	private String k;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		if (i >= 100) {
			if (i <= 200) {
				this.i = i;
				System.out.println(i);
				}
			else {
			System.out.println("Please provede value less than 200");
			}
			
		} else {
			System.out.println("Please provede value grater than 100");
		}
	}

	public double getJ() {
		return j;
	}

	public void setJ(int j) {
		if (j<0) {
		this.j = j;
		System.out.println(j);
		}
		else {
			System.out.println("Please enter value less than 0");
		}
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
		System.out.println(n.toUpperCase());
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

}
