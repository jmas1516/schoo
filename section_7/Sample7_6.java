//�G�߃��\�b�h
import java.util.Scanner;

class Sample7_6{
	static void printSeason(int m){
		if      (m >= 3 && m <= 5)  System.out.print("�t");
		else if (m >= 6 && m <= 8)  System.out.print("��");
		else if (m >= 9 && m <= 11) System.out.print("�H");
		else if (m == 12 || m == 1 || m == 2) System.out.print("�~");
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�������(1�ȏ�12�ȉ��̐���) : ");
		int m = scan.nextInt();
		
		System.out.print("�G�߁F"); printSeason(m);
		System.out.println();
	}
}