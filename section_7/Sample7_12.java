//n�r�b�g��]
import java.util.Scanner;

class Sample7_12{
	//---int�^�̃r�b�g�\����\�� ---//
	static void printBits(int x){
		for(int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	//--- n�r�b�g�E��] ---//
	static int rRotate(int x, int n){
	int rX;
	rX = (x >>> n) + (x << (32 - n));
	return rX;
	}
	
	//-- n�r�b�g����] ---//
	static int lRotate(int x, int n){
	int lX;
	lX = (x << n) + (x >>> (32 - n));
	return lX;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����F");
		int x = scan.nextInt();
		
		System.out.print("��]����r�b�g���F");
		int n = scan.nextInt();
		
		System.out.printf("%10d : ",x); printBits(x);
		System.out.println();
		
		System.out.printf("�E��%2d��] : ", n); printBits(rRotate(x, n));
		System.out.println();
		
		System.out.printf("����%2d��] : ", n); printBits(lRotate(x, n));
		System.out.println();
	}
}