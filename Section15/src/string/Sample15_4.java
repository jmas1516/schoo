package string;

public class Sample15_4 {

	public static void printDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}

	public static void main(String[] args) {

		printDouble(123.456, 2, 6);
		System.out.println();
		printDouble(123.456, 3, 6);
	}
}
