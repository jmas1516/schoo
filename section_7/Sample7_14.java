//ビット指定した範囲をon, off, 反転
import java.util.Scanner;

class Sample7_14{
	//--- int型のビット構成を表示 ---//
	static void printBits(int x){
		for(int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? "1" : "0");
		System.out.println();
	}
	
	//--- すべての位が1でn桁の2進数 ---//
	static int n1(int n){
		int t = 1;
		for(int i = 1; i < n; i++)
			t |= 1 << i;
		return t;
	}
	
	//--- pos番目からn個のビットを1 ---//
	static int setN(int x, int pos, int n){
		int set = x | (n1(n) << pos);
		return set;
	}
	//--- pos番目からn個のビットを0 ---//
	static int resetN(int x, int pos, int n){
		int reset = x & ~(n1(n) << pos);
		return reset;
	}
	
	//--- pos番目からn個のビットを反転 ---//
	static int reverseN(int x, int pos, int n){
		int reverse = x ^ (n1(n) << pos);
		return reverse;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" 整 数 ："); int x   = scan.nextInt();
		System.out.print("pos番目："); int pos = scan.nextInt();
		System.out.print(" n  個 ："); int n   = scan.nextInt();
		
		System.out.printf("%d : \n", x);
		
		System.out.printf("%2d番目から%2d個のビットを1    : ", pos, n);
		printBits(setN(x, pos, n));
		
		System.out.printf("%2d番目から%2d個のビットを0    : ", pos , n);
		printBits(resetN(x, pos, n));
		
		System.out.printf("%2d番目から%2d個のビットを反転 : ", pos , n);
		printBits(reverseN(x, pos, n));
	}
}