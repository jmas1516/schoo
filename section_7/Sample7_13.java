//posビット目を1
//posビット目を0
//反転した値を返す
import java.util.Scanner;

class Sample7_13{
	//--- int型のbit構成を表示 ---//
	static void printBits(int x){
		for(int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? "1" : "0");
		System.out.println();
	}
	//--- posビット目を1にする ---//
	static int set(int x, int pos){
		int set = x | (1 << pos);
		return set;
	}
	
	//--- pos ビット目を0にする ---//
	static int reset(int x, int pos){
		int reset = x & ~(1 << pos);
		return reset;
	}
	
	//--- pos ビット目を反転する ---//
	static int reverse(int x, int pos){
		int reverse = x ^ (1 << pos);
		return reverse;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("整数：");    int x = scan.nextInt();
		System.out.print("pos番目："); int pos = scan.nextInt();
		
		System.out.printf("%6d      ：", x); printBits(x);
		System.out.printf("%2d番目を1   ：", pos); printBits(set(x, pos));
		System.out.printf("%2d番目を0   ：", pos); printBits(reset(x, pos));
		System.out.printf("%2d番目を反転：", pos); printBits(reverse(x, pos));
	}
}