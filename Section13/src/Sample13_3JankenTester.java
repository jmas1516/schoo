package janken;

//人間vs機械
public class Sample13_3JankenTester {
	public static void main(String[] args) {
		String result; //結果

		Sample13_3PlayHuman p1 = new Sample13_3PlayHuman("たろう");
		Sample13_3PlayMachine p2 = new Sample13_3PlayMachine("メカオ");

		do {
			p1.scanHand();
			p2.randHand();

			System.out.println(p1);
			System.out.println(p2);

			result = Sample13_3Janken.janken(p1, p2);
			System.out.println("結果：" + result);
			System.out.println();

		}while(result == "あいこ");
	}
}
