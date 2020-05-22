package Shape;

/**
 * 長方形を表すクラス
 * @see Shape
 */
public class Sample13_1Rectangle extends Sample13_1Shape implements Sample14_1Plane2D{
	private int width;  //幅
	private int height; //高さ

	//--- コンストラクタ ---//
	public Sample13_1Rectangle(int width, int height) {
		this.width  = width;
		this.height = height;
	}
	@Override
	//--- toString:長方形に関する図形情報を表す文字列を返却 ---//
	public String toString() {
		return "Rectangle(with:" + width + ".height:" + height + ")";
	}

	@Override
	//--- draw:長方形の描写 ---///
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	//--- インターフェース:面積を求める ---//
	public int getArea() {
		return width * height;
	}
}
