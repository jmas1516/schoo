//最大、最小を求めるメソッドを集めたユーティリティ
public class Sample10_3MinMax {

	public static double min(double a, double b) {
		return a <= b ? a : b;
	}

	public static double min(double a, double b, double c) {
		double min = (a <= b ? a : b);
		return (min <= c ? min : c);
	}

	public static double min(double[] a) {
		double min = a[0];
		for(int i = 0; i < a.length; i++) {
			if(min > a[i]) min = a[i];
		}
		return min;
	}


	public static double max(double a, double b) {
		return a >= b ? a : b;
	}

	public static double max(double a, double b, double c) {
		double max = (a >= b ? a : b);
		return (max >= c ? max : c);
	}

	public static double max(double[] a) {
		double max = a[0];
		for(int i = 0; i < a.length; i++) {
			if (max < a[i]) max = a[i];
		}
		return max;
	}
}
