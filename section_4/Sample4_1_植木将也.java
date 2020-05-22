//do while

import java.util.Scanner;
class Sample4_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int retry;
		
		do{
			System.out.print("整数値："); int n = scanner.nextInt();
			
			
			if (n > 0)
				System.out.println("その値は正です");
			else if (n < 0)
				System.out.println("その値は負です");
			else 
				System.out.println("その値は0です");
			
			System.out.print("もう一度やる？yes → 1, no → 0 :");
			retry = scanner.nextInt();
		} while (retry == 1);
	}
}