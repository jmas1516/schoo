//標準体重

import java.util.Scanner;
class Sample4_15{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		double h1, h2, d;
		do{
			System.out.print("何�pから："); h1 = scanner.nextDouble();
			System.out.print("何�pまで："); h2 = scanner.nextDouble();
			System.out.print("何�pごと："); d  = scanner.nextDouble();
		}while(h1 <= 0 && h2 <= h1 && d < 0);
		
		System.out.println("身長 標準体重");
		for(;h1 <= h2; h1 += d){
			System.out.println(h1+ " " + ((h1-100)*0.9));
		}
	}
}