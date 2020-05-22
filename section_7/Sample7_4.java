//級数

import java.util.Scanner;

class Sample7_4{
	static int sumUp(int n){
		int sumUp = 0;
		while(n > 0){
			sumUp += n;
			n--;
		}
		return sumUp;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("自然数 : "); n = scan.nextInt();
		}while(n <= 0);
		
		System.out.print("1から" + n + "までの全整数の総和 : " + sumUp(n));
	}
}
