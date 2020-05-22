//else if確認
import java.util.Scanner;
class Sample3_3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = scanner.nextInt();
		
		if (n > 0)
			System.out.println("その値は正です。");
		else if (n < 0)
			System.out.println("その値は負です。");
		else if (n == 0)
			System.out.println("その値は0です。");
	}
}

//最後をelse if (n == 0)にしても実行可能