//2つの整数の差を判定

import java.util.Scanner;
class Sample3_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();
		
		int c = a-b;
		
		if (c>=-10 && c<=10)
			System.out.println("それらの差は10以下です。");
		else
			System.out.println("それらの差は11以上です。");
	}
}