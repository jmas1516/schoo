//‹‰”

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
			System.out.print("©‘R” : "); n = scan.nextInt();
		}while(n <= 0);
		
		System.out.print("1‚©‚ç" + n + "‚Ü‚Å‚Ì‘S®”‚Ì‘˜a : " + sumUp(n));
	}
}
