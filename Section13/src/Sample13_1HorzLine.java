package Shape;

/**
 * 水平直線を表す
 * AbstLineから派生
 * @see Shape
 * @see AbstLine
 */
public class Sample13_1HorzLine extends Sample13_1AbstLine{

	//--- コンストラクタ ---///
	public Sample13_1HorzLine(int length) {
		super(length);
	}

	//--- toString:水平直線に関する図形情報を表す文字列を返却 ---//
	public String toString() {
		return "HorzLine(length:" + getLength() + ")";
	}

	//--- draw:水平直線の描画 ---//
	public void draw() {
		for(int i = 1; i <= getLength(); i++)
			System.out.print("-");
		System.out.println();
	}
}
