//数当てゲーム

import java.util.Scanner;
import java.util.Random;

class Sample4_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random  rand    = new Random();
		
		int x = 10 + rand.nextInt(90);
		
		System.out.println("数当てゲーム開始！");
		System.out.println("10～99の数を当ててね");
		
		int n;
		do{
			System.out.println("いくつかな:");
			n = scanner.nextInt();
			
			if      (n > x) System.out.println("もっと小さいよ");
			else if (n < x) System.out.println("もっと大きいよ");
		}while (n != x);
		System.out.println("正解。頑張ったね");
	}
}