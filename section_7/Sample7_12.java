//nビット回転
import java.util.Scanner;

class Sample7_12{
	//---int型のビット構成を表示 ---//
	static void printBits(int x){
		for(int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	//--- nビット右回転 ---//
	static int rRotate(int x, int n){
	int rX;
	rX = (x >>> n) + (x << (32 - n));
	return rX;
	}
	
	//-- nビット左回転 ---//
	static int lRotate(int x, int n){
	int lX;
	lX = (x << n) + (x >>> (32 - n));
	return lX;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("整数：");
		int x = scan.nextInt();
		
		System.out.print("回転するビット数：");
		int n = scan.nextInt();
		
		System.out.printf("%10d : ",x); printBits(x);
		System.out.println();
		
		System.out.printf("右に%2d回転 : ", n); printBits(rRotate(x, n));
		System.out.println();
		
		System.out.printf("左に%2d回転 : ", n); printBits(lRotate(x, n));
		System.out.println();
	}
}