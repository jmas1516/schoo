//曜日の英語

import java.util.Scanner;
import java.util.Random;

class Sample6_15{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		String[] week   = {"sunday", "monday", "tuesday", "ednesday", "thursday", "friday", "saturday"};
		String[] weekJp = {"日", "月", "火", "水", "木", "金", "土"};
		
		int    x = -1    ; //連続判定, 入力文字列
		int    n         ; //ランダム0~6
		String y = ""    ; //入力
		int    retry = 0 ; //retry判定
		
		System.out.println("英語の曜日名を小文字で入力してください");
		do{
			n = rand.nextInt(7);
			if(n == x) continue;
			x = n;
			
			System.out.print(weekJp[n] + "曜日:");
			y = scan.next();
			
			if(y.equals(week[n])) System.out.println("Excellemt!!");
			else             System.out.println("The correct answer is " + week[n]);
			
			System.out.print("Retry? Yes...1, No...0 : ");
			retry = scan.nextInt();
			
		}while(retry == 1);
	}
}