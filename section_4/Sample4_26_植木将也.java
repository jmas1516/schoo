//読み込んだ整数を加算(0が入力されたら終了)

import java.util.Scanner;
class Sample4_26{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか。：");
		int n = scanner.nextInt();
		
		int sum = 0, ave = 0, j = 0;
		for(int i = 1; i <= n; i++){
			System.out.print("整数:");
			int t = scanner.nextInt();
			if ( t < 0){
				System.out.println("負の数は加算しません。");
				j--;
				continue;
			}
			sum += t;
			if (i != j) ave = sum /(i-j);
		}
		System.out.println("合計:" + sum + " 平均:" + ave);
	}
}