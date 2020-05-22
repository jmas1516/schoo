////任意の配列を追加
import java.util.Scanner;
import java.util.Random;

class Sample7_20{
	//--- 配列aの要素a[idx]に追加 ---//
	static void aryIns(int[] a, int idx, int x){
		for(int i = (a.length - 1); i > idx; i--){
			a[i] = a[i - 1];
		}
		a[idx] = x;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("配列数："); int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(201) - 100;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		System.out.print("追加する要素のインデックス："); int idx = scan.nextInt();
		System.out.print("追加する要素："); int x = scan.nextInt();
		aryIns(a, idx , x);
		
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}