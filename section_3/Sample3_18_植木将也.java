//季節を表示

import java.util.Scanner;
class Sample3_18{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("季節を教えるよ。知りたい月を整数で入れてね。:");
		int month = scanner.nextInt();
		
		switch (month){
		case 3 :;
		case 4 :;
		case 5 : System.out.println("春");break;
		case 6 :;
		case 7 :;
		case 8 : System.out.println("夏");break;
		case 9 :;
		case 10:;
		case 11: System.out.println("秋");break;
		case 12:;
		case 1 :;
		case 2 : System.out.println("冬");break;
		default: System.out.println("1〜12を入力してね。");break;
		}
	}
}
		