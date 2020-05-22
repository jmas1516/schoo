package janken;
/**
 * 人間がplayer
 * @author Ueki Masaya
 * @see Sample13_3Player
 */

import java.util.Scanner;

public class Sample13_3PlayHuman extends Sample13_3Player{
	Scanner scan = new Scanner(System.in);

	//--- コンストラクタ ---//
	public Sample13_3PlayHuman(String name) {
		super(name);
	}

	//--- 手の値を決定 ---//
	public void scanHand() {
		System.out.print("handの値を入力... グー:-1, チョキ:0, パー:1 | ");
		int hand = scan.nextInt();
		if(hand < -1) hand = -1;
		if(hand > 1 ) hand = 1;
		setHand(hand);
	}

	@Override
	public String toString() {
		return "[人間]" + getName() + ":" + Sample13_3Janken.handType(getHand());
	}
}
