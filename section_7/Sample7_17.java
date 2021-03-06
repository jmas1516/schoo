//keyを後ろから探索
import java.util.Scanner;
import java.util.Random;

class Sample7_17{
	//--- 配列aの要素がkeyである要素番号を探索(後ろから) ---//
	static int searchB(int[] a, int key){
		for(int i = (a.length - 1); i >= 0; i--)
			if(a[i] == key) return i;
		return -1;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("配列数："); int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(11) - 6;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		System.out.print("探す値："); int key = scan.nextInt();
		int idx = searchB(a, key);
		if(idx == -1)
			System.out.println("その値は存在しません");
		else
			System.out.println("その値はa[" + idx + "]にあります");
	}
}
