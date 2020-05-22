//入力した値±5の乱数表示
import java.util.Scanner;
import java.util.Random;
	class Sample2_8{
		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			Random  rand  = new Random();
			
			System.out.print("数値を入力してください：");
			int x = stdIn.nextInt();
			
			int y = rand.nextInt(10);
			
			System.out.println("その値の±5の乱数を生成しました。それは" + (x-5+y) + "です。");
		}
	}
