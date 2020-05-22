package id;

import java.util.Random;

//連番クラス
public class Sample11_1Id {

	private static int counter = 0;

	private int id;

	static {
		Random rand = new Random();
		counter = rand.nextInt(10) * 100;
	}
	//--- コンストラクタ ---//
	public Sample11_1Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}
}