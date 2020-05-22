//入力した整数を３で割った余りを求める

import java.util.Scanner;
class Sample3_7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("自然数：");
		int n = scanner.nextInt();
		int m = n % 3;
		
		if (n > 0)
			if (m == 0)
				System.out.println("その値は3で割り切れます");
			else if (m == 1)
				System.out.println("その値を3で割った余りは1です");
			else
				System.out.println("その値を3で割った余りは2です");
		else
			System.out.println("正でない値が入力されました");
	}
}
				