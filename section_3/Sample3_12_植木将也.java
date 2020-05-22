//3つの整数の最小値

import java.util.Scanner;
class Sample3_12{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数a："); int a = scanner.nextInt();
		System.out.print("整数b："); int b = scanner.nextInt();
		System.out.print("整数c："); int c = scanner.nextInt();
		
		int min = a < b ? a : b;
		
		System.out.println("最小値：" + (min < c ? min:c));
	}
}