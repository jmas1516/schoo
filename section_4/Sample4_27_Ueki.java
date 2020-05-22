//数当てゲームVer.2

import java.util.Random;
import java.util.Scanner;

class Sample4_27{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random  rand    = new Random();
		
		int n = 1 + rand.nextInt(100);
		
		System.out.println("1～100の数字数字を当てよ");
		System.out.println("6回で分からなければゲームオーバー");
		
		int x;
		
		for(int i = 6; i > 0; i--){
			
			System.out.println("あと" + i + "回挑戦可能");
			
			if(i == 2){
				if     (n % 3 == 0 && n % 2 == 0) System.out.println("ヒント：3の倍数で偶数だよ");
				else if(n % 3 == 0 && n % 2 == 1) System.out.println("ヒント：3の倍数で奇数だよ");
				else if(n % 3 != 0 && n % 2 == 0) System.out.println("ヒント：偶数で3の倍数ではないよ");
				else                              System.out.println("ヒント：奇数で3の倍数ではないよ");
			}
			System.out.println("答えを入力:"); x = scanner.nextInt();
			
			if(x == n ){
				System.out.println("大正解！！すごいね！！"); 
				break;
			}
			if(i == 1 ){
				System.out.println("ゲームオーバー\n正解は" + n + "でした。また挑戦してね!");
				break;
			}
			if(x > n) System.out.println("もっと小さい");
			else      System.out.println("もっと大きい");
		}
	}
}