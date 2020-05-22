package throwable;

//---範囲外例外 ---//
public class Sample16_2RangeError extends RuntimeException{
	public Sample16_2RangeError(int n) {
		super("例外の範囲外の値 : " + n);
	}
}