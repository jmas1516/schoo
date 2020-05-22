//2つの整数の差を表示

import java.util.Scanner;
class Sample3_10{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();
		
		int c = a-b;
		
		if (c < 0)
			System.out.println("差：" + -c);
		else
			System.out.println("差：" + c);
	}
}