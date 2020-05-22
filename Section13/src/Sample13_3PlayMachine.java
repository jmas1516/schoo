package janken;
/**
 * 機械がplayer
 * @author Ueki Masaya
 * @see Sample13_3Player
 */
import java.util.Random;

public class Sample13_3PlayMachine extends Sample13_3Player{
	Random rand = new Random();

	//--- コンストラクタ ---//
	public Sample13_3PlayMachine(String name) {
		super(name);
	}

	//---手の値をランダムに入力---//
	public void randHand() {
		System.out.println("手の値をランダムに生成します");
		int hand = rand.nextInt(3) - 1;
		setHand(hand);
	}

	@Override
	public String toString() {
		return "[機械]" + getName() + ":" + Sample13_3Janken.handType(getHand());
	}
}
