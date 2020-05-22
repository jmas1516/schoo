//昇順

import java.util.Scanner;
class Sample3_16{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数値a："); int a = scanner.nextInt();
		System.out.print("整数値b："); int b = scanner.nextInt();
		System.out.print("整数値c："); int c = scanner.nextInt();
		
		int t;
		if(a <= b && a <= c){
			if(b >= c){t = b; b = c; c = t;}
		}else if (b <= c && b <= a){
			t = a; a = b; b = t;
			if(b >= c){t = b; b = c; c = t;}
		}else{
			t = a; a = c; c = t;
			if(b >= c){t = b; b = c; c = t;}
		}
		
		System.out.println("a≦b≦cになるようにソートしました。");
		System.out.println("変数aは" + a + "です。\n変数bは" + b + "です。\n変数cは" + c + "です。");
	}
}