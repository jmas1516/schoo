package janken;
/**
 * じゃんけんをするメソッドを集めたもの
 * @author Ueki Masaya
 *
 */
public class Sample13_3Janken {
	//--- 手の種類を文字列で返却 ---//
	//-1：グー, 0:チョキ, 1:パー
	public static String handType(int hand) {
		if(hand < 0) return "グー";
		if(hand == 0) return "チョキ";
		return "パー";
	}

	//--- 2人でじゃんけん ---//
	//勝者の名前を返却   あいこの場合,文字列"あいこ"を返却
	public static String janken(Sample13_3Player p1, Sample13_3Player p2) {
		int h1 = p1.getHand();
		int h2 = p2.getHand();
		if(h1 == h2) {
			return "あいこ";
		}
		if(h1 < 0) { //p1がグー
			if(h2 == 0) {
				return "勝者：" + p1.getName();
			}else {
				return "勝者：" +p2.getName();
			}
		}
		if(h1 == 0) { //p1がチョキ
			if(h2 < 0) {
				return "勝者：" +p2.getName();
			}else {
				return "勝者：" +p1.getName();
			}
		}
		if(h2 < 0) {  //p1がパー
			    return "勝者：" +p1.getName();
		}else {
			    return "勝者：" +p2.getName();
		}
	}

	//--- 3人でじゃんけん ---//
	//勝者の名前or"あいこ"を返却
	public static String janken(Sample13_3Player p1, Sample13_3Player p2, Sample13_3Player p3) {
		String win = "勝者:";
		int[] h = new int[3];
		h[0] = p1.getHand();
		h[1] = p2.getHand();
		h[2] = p3.getHand();
		if(h[0] == h[1] && h[1] == h[2] && h[2] == h[0]) return "あいこ";
		if(arrayAdd(h) == 0) return "あいこ";
		if(arrayMax(h) == 0) {
			 if(h[0] == -1) win += p1.getName() + " ";
			 if(h[1] == -1) win += p2.getName() + " ";
			 if(h[2] == -1) win += p3.getHand() + " ";
		}
		else if(arrayMin(h) == 0) {
			 if(h[0] ==  0) win += p1.getName() + " ";
			 if(h[1] ==  0) win += p2.getName() + " ";
			 if(h[2] ==  0) win += p3.getHand() + " ";
		}else {
		     if(h[0] ==  1) win += p1.getName() + " ";
		     if(h[1] ==  1) win += p2.getName() + " ";
		     if(h[2] ==  1) win += p3.getHand() + " ";
		}
		 return win;
	}

	//配列の総和を求めるメソッド//
	public static int arrayAdd(int[] a) {
		int add = 0;
		for(int i : a) {
			add += i;
		}return add;
	}

	//配列の最大値を求めるメソッド//
	public static int arrayMax(int[] a) {
		int max = a[0];
		for(int i : a) {
			if(max < i) max = i;
		}return max;
	}

	//配列の最小値を求めるメソッド//
	public static int arrayMin(int[] a) {
		int min = a[0];
		for(int i : a) {
			if(min > i) min = i;
		}return  min;
	}
}
