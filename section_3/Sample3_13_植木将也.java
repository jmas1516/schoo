//3つの整数の中央値

import java.util.Scanner;
class Sample3_13{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数a："); int a = scanner.nextInt();
		System.out.print("整数b："); int b = scanner.nextInt();
		System.out.print("整数c："); int c = scanner.nextInt();
		
		int mid = a;
		
		if (a >= b){
			if (c >= a)     mid = a;
			else if (c <= b) mid = b;
			else            mid = c;
		}else{
			if(c >= b)      mid = b;
			else if(c <= a)  mid = a;
			else            mid = c;
		}
		System.out.println("中央値：" + mid);
	}
}