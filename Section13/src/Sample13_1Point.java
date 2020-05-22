package Shape;

/**
 * 点を表すクラス
 * @see Sample13_1Shape
 */
public class Sample13_1Point extends Sample13_1Shape{
	//--- コンストラクタ ---//
	public Sample13_1Point() {

	}

	//--- toString 文字列"Point"を返却 ---//
	public String toString() {
		return "Point";
	}

	//--- プラス記号'+'を１つ表示して改行 ---//
	public void draw() {
		System.out.println('+');
	}

	public void aaa() {
		System.out.println("aaa");
	}

}
