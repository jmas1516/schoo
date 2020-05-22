package Shape;
/**
 * 左下が直角の直角二等辺三角形
 * AbstLineから派生
 * @see Shape
 * @see AbstLine
 */
public class Sample13_2TriLowL extends Sample13_1AbstLine{

	//--- コンストラクタ ---//
	public Sample13_2TriLowL(int length) {
		super(length);
	}

	//--- toString ---//
	public String toString() {
		return "TriLowL(length:" + getLength() + ")";
	}

	public void draw() {
		for(int i = 1; i <= getLength(); i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
