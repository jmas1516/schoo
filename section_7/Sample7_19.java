////任意の配列を削除
import java.util.Scanner;
import java.util.Random;

class Sample7_19{
	//--- 配列aから要素a[idx]からn個削除(余った要素はそのまま) ---//
	static void aryRmvN(int[] a, int idx, int n){
		for(int i = idx; i < (a.length - n); i++){
			a[i] = a[i + n];
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("配列数："); int nIdx = scan.nextInt();
		
		int[] a = new int[nIdx];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(201) - 100;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		System.out.print("削除する配列のインデックス："); int idx = scan.nextInt();
		System.out.print("削除する個数："); int n = scan.nextInt();
		
		aryRmvN(a, idx, n);
		
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}