//直角三角形

import java.util.Scanner;

class Sample7_7{
	
	//--- 文字cをn個表示 ---//
	static void putChars(char c, int n){
		while (n-- > 0)
			System.out.print(c);
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("左下直角の三角形を表示します");
		System.out.print("段数は : "); int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++){
			putChars('*', i);
			System.out.println();
		}
	}
}