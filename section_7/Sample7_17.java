//key����납��T��
import java.util.Scanner;
import java.util.Random;

class Sample7_17{
	//--- �z��a�̗v�f��key�ł���v�f�ԍ���T��(��납��) ---//
	static int searchB(int[] a, int key){
		for(int i = (a.length - 1); i >= 0; i--)
			if(a[i] == key) return i;
		return -1;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("�z�񐔁F"); int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(11) - 6;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		System.out.print("�T���l�F"); int key = scan.nextInt();
		int idx = searchB(a, key);
		if(idx == -1)
			System.out.println("���̒l�͑��݂��܂���");
		else
			System.out.println("���̒l��a[" + idx + "]�ɂ���܂�");
	}
}
