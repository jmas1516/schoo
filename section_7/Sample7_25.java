//配列aから要素a[idx]を先頭にn個削除した配列を返却
import java.util.Scanner;
import java.util.Random;

class Sample7_25{
	static Scanner scan = new Scanner(System.in);
	static Random  rand = new Random();
	
	//--- 配列aから要素a[idx]を先頭にn個削除した配列を返却 ---//
	//--- 全て削除する場合、先頭の要素のみの配列を返却     ---//
	static int[] arrayRmvIdxN(int[] a, int idx, int n){
		//int[] bの配列数確定
		int[] b;
		if(idx == 0 && n >= a.length){
			b = new int[]{a[0]};
		}else if(idx >= a.length || idx < 0){
			b = new int[a.length]; 
		}else if((idx + n) > a.length){
			b = new int[idx];
		}else{
			b = new int[a.length - n];
		}
		
		//int[] bへ要素を代入
		if(idx == 0 && n >= a.length);
		else if(idx >= a.length || idx < 0){
			for(int i = 0; i < a.length; i++){
				b[i] = a[i];
			}
		}else{
			for(int i = 0, j = 0; i < a.length; i++){
				if(a[i] == a[idx]){
					i += (n - 1);
					continue;
				}
				b[j] = a[i];
				j++;
			}
		}return b;
	}
	
	public static void main(String[] args){
		//配列a生成
		int len;
		do{
			System.out.print("配列aの要素数len：");len = scan.nextInt();
		}while(len <= 0);
		int a[] = new int[len];
		
		//要素代入
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(100);
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		//削除
		System.out.print("削除する要素の先頭のインデックス：");
		int idx = scan.nextInt();
		System.out.print("削除する個数：");
		int n   = scan.nextInt();
		int[] b = arrayRmvIdxN(a, idx, n);
		
		System.out.println("削除しました");
		for(int i = 0; i < b.length; i++){
			System.out.println("a[" + i + "] = " +  b[i]);
		}
	}
}