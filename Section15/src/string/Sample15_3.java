package string;
//文字列で一致する部分をそろえる
public class Sample15_3 {
	public static void main(String[] args) {
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		String s2 = "hij";

		int idx = s1.indexOf(s2);
		System.out.println(idx);
		if(idx == 0) {
			System.out.println("s1の中にs2は含まれません");
		}else {
			System.out.println(s1);
			for(int i = 0; i < idx; i++) {
				System.out.print(" ");
			}
			System.out.println(s2);
		}
	}
}
