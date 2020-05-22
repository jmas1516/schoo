package janken;

//人間vs機械1vs機械2
public class Sample15_5JankenTester2 {
	public static void main(String[] args) {
		String result; //結果

		Sample13_3PlayHuman   p1 = new Sample13_3PlayHuman("たろう");
		Sample13_3PlayMachine p2 = new Sample13_3PlayMachine("メカオ");
		Sample13_3PlayMachine p3 = new Sample13_3PlayMachine("Mr.ランダム");

		do {
			p2.randHand();
			p3.randHand();
			p1.scanHand();

			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);

			result = Sample13_3Janken.janken(p1, p2, p3);
			System.out.println("結果：" + result);
			System.out.println();

		}while(result == "あいこ");
	}
}