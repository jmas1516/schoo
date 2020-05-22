//配列aの最小値を求める
import java.util.Scanner;

class Sample7_16{
	static int minOf(int[] a){
		int minOf = a[0];
		for(int i = 0; i < a.length; i++)
			if(minOf > a[i]) minOf = a[i];
		return minOf;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("配列aの要素数："); n = scan.nextInt();
		}while(n <= 0);
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = "); a[i] = scan.nextInt();
		}
		
		System.out.println("配列aの要素の最小値：" + minOf(a));
	}
}