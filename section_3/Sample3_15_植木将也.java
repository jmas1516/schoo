//降順

import java.util.Scanner;
class Sample3_15{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数値a："); int a = scanner.nextInt();
		System.out.print("整数値b："); int b = scanner.nextInt();
		
		if(a < b){
			int t = a;
			a = b;
			b = t;
		}
		
		if (a != b){
			System.out.println("a≦bになるようにソートしました。");
			System.out.println("実数aは" + a + "です。\n実数bは" + b + "です。");
		}else{
			System.out.println("二つの値は同じです。");
		}
	}
}