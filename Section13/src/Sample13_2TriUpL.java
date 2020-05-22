package Shape;
/**
 * 左上が直角の直角二等辺三角形
 * AbstLineから派生
 * @see Shape
 * @see AbstLine
 */
public class Sample13_2TriUpL extends Sample13_1AbstLine{

	//--- コンストラクタ ---//
	public Sample13_2TriUpL(int length) {
		super(length);
	}

	//--- toString ---//
	public String toString() {
		return "TriUpL(length:" + getLength() + ")";
	}

	public void draw() {
		for(int i = 1; i <= getLength(); i++) {
			for(int j = getLength(); j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
