package janken;
/**
 * じゃんけんをするプレイヤーの抽象クラス
 * 名前のみ設定
 * @author Ueki Masaya
 * @see Sample13_3PlayHuman Sample13_3PlayMachine
 */
public abstract class Sample13_3Player {
	private String name; //playerの名前
	private int hand;

	//--- コンストラクタ ---//
	public Sample13_3Player(String name) {
		this.name = name;
	}

	//--- ゲッタ ---//
	public String getName() { //nameを取得
		return name;
	}
	public int getHand() { //handを取得
		return hand;
	}

	//--- セッタ ---//
	public void setHand(int hand) { //handをセット
		this.hand = hand;
	}

	public abstract String toString();
}
