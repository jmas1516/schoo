package Shape;

public abstract class Sample13_1Shape {

	//--- 派生クラスでtoStringを強要 ---//
	public abstract String toString();

	//--- 図形の描画 ---//
	public abstract void draw();

	//--- toStringの文字列を表示 --- //
	//--- draw()を呼び出し、図形の表示 --- //
	public void print() {
		System.out.println(toString());
		draw();
	}
	public void aaa() {
	}
}
