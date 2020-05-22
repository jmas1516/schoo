//凹凸な二次元配列

import java.util.Scanner;
class Sample6_18{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("行数："); int r = scan.nextInt();
		
		int[][] a = new int[r][];
		
		int c;
		for(int i = 0; i < r; i++){
			System.out.print((i + 1) + "行目の要素数：");
			c = scan.nextInt();
			a[i] = new int[c];
		}
		
		for(int i = 0; i < r; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print("a[" + i + "][" + j +"] = ");
				a[i][j] = scan.nextInt();
			}
		}
		
		for(int[] i : a){
			for(int j : i){
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
	}
}