//pos�r�b�g�ڂ�1
//pos�r�b�g�ڂ�0
//���]�����l��Ԃ�
import java.util.Scanner;

class Sample7_13{
	//--- int�^��bit�\����\�� ---//
	static void printBits(int x){
		for(int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? "1" : "0");
		System.out.println();
	}
	//--- pos�r�b�g�ڂ�1�ɂ��� ---//
	static int set(int x, int pos){
		int set = x | (1 << pos);
		return set;
	}
	
	//--- pos �r�b�g�ڂ�0�ɂ��� ---//
	static int reset(int x, int pos){
		int reset = x & ~(1 << pos);
		return reset;
	}
	
	//--- pos �r�b�g�ڂ𔽓]���� ---//
	static int reverse(int x, int pos){
		int reverse = x ^ (1 << pos);
		return reverse;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����F");    int x = scan.nextInt();
		System.out.print("pos�ԖځF"); int pos = scan.nextInt();
		
		System.out.printf("%6d      �F", x); printBits(x);
		System.out.printf("%2d�Ԗڂ�1   �F", pos); printBits(set(x, pos));
		System.out.printf("%2d�Ԗڂ�0   �F", pos); printBits(reset(x, pos));
		System.out.printf("%2d�Ԗڂ𔽓]�F", pos); printBits(reverse(x, pos));
	}
}