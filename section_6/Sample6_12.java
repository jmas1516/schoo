//シャッフル

import java.util.Scanner;
import java.util.Random;

class Sample6_12{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("要素数："); final int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = scan.nextInt();
		}
		// 0から(n-1)までの整数ランダムに生成(重複なし)
		int[] b = new int[n]; 
		for(int i = 0; i < n; i++){
			do{
				b[i] = rand.nextInt(n);
				
				for(int j = 0; j < i; j++)
					if(b[i] == b[j]) b[i] = -1;
				
			}while(i > 0 && b[i] == -1);
		}
		
		//コメント
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = " + a[i] + " ");
			if(i % 5 == 4) System.out.println();
		}
		System.out.println();
		System.out.println("シャッフルします");
		
		//交換
		int[] c = new int[n];
		for(int i = 0; i < n; i++)
			c[i] = a[b[i]];
		for(int i = 0; i < n; i++)
			a[i] = c[i];
			
		//コメント
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = " + a[i] + " ");
			if(i % 5 == 4) System.out.println();
		}
	}
}