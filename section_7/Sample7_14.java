//�r�b�g�w�肵���͈͂�on, off, ���]
import java.util.Scanner;

class Sample7_14{
	//--- int�^�̃r�b�g�\����\�� ---//
	static void printBits(int x){
		for(int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? "1" : "0");
		System.out.println();
	}
	
	//--- ���ׂĂ̈ʂ�1��n����2�i�� ---//
	static int n1(int n){
		int t = 1;
		for(int i = 1; i < n; i++)
			t |= 1 << i;
		return t;
	}
	
	//--- pos�Ԗڂ���n�̃r�b�g��1 ---//
	static int setN(int x, int pos, int n){
		int set = x | (n1(n) << pos);
		return set;
	}
	//--- pos�Ԗڂ���n�̃r�b�g��0 ---//
	static int resetN(int x, int pos, int n){
		int reset = x & ~(n1(n) << pos);
		return reset;
	}
	
	//--- pos�Ԗڂ���n�̃r�b�g�𔽓] ---//
	static int reverseN(int x, int pos, int n){
		int reverse = x ^ (n1(n) << pos);
		return reverse;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" �� �� �F"); int x   = scan.nextInt();
		System.out.print("pos�ԖځF"); int pos = scan.nextInt();
		System.out.print(" n  �� �F"); int n   = scan.nextInt();
		
		System.out.printf("%d : \n", x);
		
		System.out.printf("%2d�Ԗڂ���%2d�̃r�b�g��1    : ", pos, n);
		printBits(setN(x, pos, n));
		
		System.out.printf("%2d�Ԗڂ���%2d�̃r�b�g��0    : ", pos , n);
		printBits(resetN(x, pos, n));
		
		System.out.printf("%2d�Ԗڂ���%2d�̃r�b�g�𔽓] : ", pos , n);
		printBits(reverseN(x, pos, n));
	}
}