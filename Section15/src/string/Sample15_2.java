package string;

public class Sample15_2 {
	public static void main(String[] args) {
		String s = "あいうえおアイウエオ";

		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + ":" + s.codePointAt(i));
		}
	}
}
