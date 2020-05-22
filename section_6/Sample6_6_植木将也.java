//最大、最小、平均

import java.util.Scanner;

class Sample6_6{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("人数："); final int n = scan.nextInt();
		
		int[] total = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print((i+1) + "人目の点数 : ");
			total[i] = scan.nextInt();
		}
		
		int sum = 0, max = total[0], min = total[0];
		for(int i = 0; i < n; i++){
			sum += total[i];
			if(max < total[i]) max = total[i];
			if(min > total[i]) min = total[i];
		}
		
		System.out.println("合計点 : " + sum);
		System.out.println("平均点 : " + (double)(sum / n));
		System.out.println("最大点 : " + max);
		System.out.println("最低点 : " + min);
	}
}