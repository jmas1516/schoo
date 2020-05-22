package pet;

public class Sample14_2RobotPet extends Sample14_2Pet implements Sample14_2Skin{

	//コンストラクタ
	public Sample14_2RobotPet(String name, String masterName) {
		super(name, masterName);
	}

	@Override
	//自己紹介
	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	//家事をする
	public void work(int sw) {
		switch(sw) {
		case 0: System.out.println("掃除します。"); break;
		case 1: System.out.println("洗濯します。"); break;
		case 2: System.out.println("炊事します。"); break;
		}
	}

	//インターフェース：スキン変更
	public void changeSkin(int skin) {
		System.out.print("スキンを");
		switch (skin) {
		case BLACK: System.out.print("漆黒"); break;
		case RED:   System.out.print("深紅"); break;
		case GREEN: System.out.print("柳葉"); break;
		case BLUE:  System.out.print("露草"); break;
		case PANDA: System.out.print("アイルロポダ・メラノレウカ"); break;
		case STAR:  System.out.print("耀星"); break;
		}
		System.out.print("にしました");
	}
}