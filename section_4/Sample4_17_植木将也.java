//‚·‚×‚Ä‚Ì–ñ”‚ğ•\¦

import java.util.Scanner;
class Sample4_17{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("®”’l:"); int n = scanner.nextInt();
		
		int j = 0;
		for(int i = 1; i <= n ; i++){
			if(n % i == 0){
			System.out.println(i);
			j++;
			}
		}
		System.out.println("–ñ”‚Í" + j + "ŒÂ‚Å‚·");
	}
}		