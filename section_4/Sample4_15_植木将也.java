//�W���̏d

import java.util.Scanner;
class Sample4_15{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		double h1, h2, d;
		do{
			System.out.print("���p����F"); h1 = scanner.nextDouble();
			System.out.print("���p�܂ŁF"); h2 = scanner.nextDouble();
			System.out.print("���p���ƁF"); d  = scanner.nextDouble();
		}while(h1 <= 0 && h2 <= h1 && d < 0);
		
		System.out.println("�g�� �W���̏d");
		for(;h1 <= h2; h1 += d){
			System.out.println(h1+ " " + ((h1-100)*0.9));
		}
	}
}