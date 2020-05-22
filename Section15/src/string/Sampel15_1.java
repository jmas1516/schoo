package string;

//読み込んだ文字列を逆順で表示
public class Sampel15_1 {

	public static void main(String[] args) {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";

		for(int i = (alphabets.length() - 1); i >= 0; i--) {
			System.out.print(alphabets.charAt(i));
		}
	}
}
