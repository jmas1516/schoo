package Shape;
/**
 *垂直直線を表す AbstLineから派生
 *@see Shape
 *@see AbstLine
 */
public class Sample13_1VertLine extends Sample13_1AbstLine{

	//--- コンストラクタ ---//
	public Sample13_1VertLine(int length) {
		super(length);
	}

	//--- toString:垂直直線に関する情報を表す文字列を返却 ---//
	public String toString() {
		return "VertLine(length:" + getLength() + ")";
	}

	//--- draw:垂直直線を描画 ---//
	public void draw() {
		for(int i = 1; i <= getLength(); i++)
			System.out.println("|");
		System.out.println();
	}
}
