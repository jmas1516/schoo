//配列を交換
import java.util.Scanner;
import java.util.Random;

class Sample7_21{
	//--- 配列の要素を交換(要素数が異なるときは少ないほうの要素分) ---//
	static void aryExchng(int[] a, int[] b){
		int l = a.length <= b.length ? a.length : b.length;
		int t;
		for(int i = 0; i < l; i++){
			t = a[i]; a[i] = b[i]; b[i] = t;
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("配列aの要素数："); int nA = scan.nextInt();
		System.out.print("配列bの要素数："); int nB = scan.nextInt();
		
		int[] a = new int[nA];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(99) + 1;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		
		int[] b = new int[nB];
		for(int i = 0; i < b.length; i++){
			b[i] = -(rand.nextInt(99) + 1);
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
		System.out.println();
		System.out.println();
		
		//交換
		aryExchng(a, b);
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		for(int i = 0; i < b.length; i++){
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}
}