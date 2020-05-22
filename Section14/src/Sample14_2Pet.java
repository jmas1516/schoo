package pet;
//ペットクラス
public class Sample14_2Pet {
	private String name;
	private String masterName;

	//---コンストラクタ---//
	public Sample14_2Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}

	//--- ゲッタ ---//
	public String getName() {return name;}
	public String getMasterName() {return masterName;}

	//---自己紹介 ---//
	public void introduce() {
		System.out.println("■僕の名前は" + name + "です！");
		System.out.println("■ご主人様は" + masterName + "です！");
	}
}
