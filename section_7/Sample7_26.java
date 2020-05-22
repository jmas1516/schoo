//要素の挿入
import java.util.Scanner;
import java.util.Random;

class Sample7_26{
	static Scanner scan = new Scanner(System.in);
	static Random  rand = new Random();
	
	//--- a[idx] にxを挿入した配列bを返却 ---//
	static int[] arrayInsOf(int[] a, int idx, int x){
		int[] b;
		if(idx < 0 || idx >= a.length){
			return a;
		}else{
			b = new int[a.length + 1];
			for(int i = 0, j = 0; i < a.length; i++){
				if(a[idx] == a[i]){
					b[idx] = x;
					j++;
				}
				b[j] = a[i];
				j++;
			}return b;
		}
	}
	
	public static void main(String[] args){
		//配列a生成
		int len;
		do{
			System.out.print("配列aの要素数len："); len = scan.nextInt();
		}while(len <= 0);
		int a[] = new int[len];
		
		//要素代入
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(100);
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		//追加
		System.out.print("追加するインデックス(0以上" + (a.length - 1) + "以下)：");
		int idx = scan.nextInt();
		System.out.print("追加する要素の値：");
		int x   = scan.nextInt();
		int[] b = arrayInsOf(a, idx, x);
		
		if(a.length == b.length){
			System.out.println("追加できませんでした");
		}else{
			System.out.println("追加しました");
			for(int i = 0; i < b.length; i++){
				System.out.println("a[" + i + "] = " +  b[i]);
			}
		}
	}
}