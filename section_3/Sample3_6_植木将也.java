import java.util.Scanner;
class Sample3_6{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数：");
		int n = scanner.nextInt();
		
		if (n > 0)
			if (n % 5 != 0)
				System.out.println("その値は10の倍数ではありません");
			else
				System.out.println("その値は10の倍数です。");
		else
			System.out.println("正でない値が入力されました。");
	}
}