//�ő�A�ŏ��A����

import java.util.Scanner;

class Sample6_6{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�l���F"); final int n = scan.nextInt();
		
		int[] total = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print((i+1) + "�l�ڂ̓_�� : ");
			total[i] = scan.nextInt();
		}
		
		int sum = 0, max = total[0], min = total[0];
		for(int i = 0; i < n; i++){
			sum += total[i];
			if(max < total[i]) max = total[i];
			if(min > total[i]) min = total[i];
		}
		
		System.out.println("���v�_ : " + sum);
		System.out.println("���ϓ_ : " + (double)(sum / n));
		System.out.println("�ő�_ : " + max);
		System.out.println("�Œ�_ : " + min);
	}
}