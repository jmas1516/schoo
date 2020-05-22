//連番クラス
public class Sample10_1Id {
	static int counter = 0;

	private int id;

	//--- コンストラクタ ---//
	public Sample10_1Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

	public static int getMaxId() {
		return(counter);
	}
}