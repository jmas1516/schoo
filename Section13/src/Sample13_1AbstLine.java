package Shape;

/**
 * 直線を表す抽象クラス
 * 直角二等辺三角形の底辺でない一辺にも併せて用いる
 * @see Sample13_1Shape
 * @see Sample13_1HorzLine Sample13_1VertLine
 * @see Sample13_2TriUpL Sample13_2TriUpR Sample13_2TriLowL Sample13_2TriLowR
 */
public abstract class Sample13_1AbstLine extends Sample13_1Shape{
	private int length; //直線の長さ

	public Sample13_1AbstLine(int length) {
		setLength(length);
	}
	//--- ゲッタ ---//
	public int getLength() {
		return length;
	}

	//--- セッタ ---//
	public void setLength(int length) {
		this.length = length;
	}

	//--- 直線に関する図形情報を表す文字列を返却する ---//
	public String toString() {
		return "AbstLine(length:" + length +")";
	}
}
