package throwable;
import java.util.Scanner;

public class Sample16_2RangeErrorTester {

	//--- nは1桁 ~ 10桁か ---//
	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}

	//--- 1桁(0 ~ 9)の整数aとbの和を求める ---//
	static int add(int a, int b) throws Sample16_2ParamenterRangeError, Sample16_2ResultRangeError{
		if (!isValid(a)) throw new Sample16_2ParamenterRangeError(a);
		if (!isValid(b)) throw new Sample16_2ParamenterRangeError(b);
		int result = a + b;
		if(!isValid(result)) throw new Sample16_2ParamenterRangeError(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("整数a"); int a = scan.nextInt();
		System.out.println("整数b"); int b = scan.nextInt();

		try {
			System.out.println("それらの和は" + add(a, b) + "です。");
		}catch(Sample16_2RangeError e) {
			System.out.println("範囲外です。" + e.getMessage());
		}

		scan.close();
	}
}
