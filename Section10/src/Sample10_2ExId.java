public class Sample10_2ExId {
	static int counter = 0;
	static int n = 1;  //idの増加量

	private int id;

	//--- コンストラクタ ---//
	public Sample10_2ExId() {
		counter += n;
		id +=counter;
	}

	//--- ゲッタ ---//
	public int getId() {
		return id;
	}

	//--- セッタ ---//
	public void setN(int n){
		this.n = n;
	}

	public static int getMaxId() {
		return(counter);
	}
}