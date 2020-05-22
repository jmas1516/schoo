
public class Sample10_3MinMaxTester {

	public static void main(String[] args) {
		double a = -2.5;
		double b = 3.0;
		double c = 5.5;
		double[] d = {a, b, c};

		System.out.println(Sample10_3MinMax.min(a, b));
		System.out.println(Sample10_3MinMax.min(a, b, c));
		System.out.println(Sample10_3MinMax.min(d));

		System.out.println(Sample10_3MinMax.max(a, b));
		System.out.println(Sample10_3MinMax.max(a, b, c));
		System.out.println(Sample10_3MinMax.max(d));
	}

}
