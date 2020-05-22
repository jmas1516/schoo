//大文字のパイ

import java.util.Scanner;
class Sample4_9{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("自然数を入力して下さい：");
			n = scanner.nextInt();
		}while(n<=0);
		
		int product = 1;//積
		int i = 1;
		while(i <= n){
			product *= i;
			i++;
		}
		System.out.println("1から" + n +"までの積は" + product +"です");
	}
}