////�C�ӂ̔z���ǉ�
import java.util.Scanner;
import java.util.Random;

class Sample7_20{
	//--- �z��a�̗v�fa[idx]�ɒǉ� ---//
	static void aryIns(int[] a, int idx, int x){
		for(int i = (a.length - 1); i > idx; i--){
			a[i] = a[i - 1];
		}
		a[idx] = x;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("�z�񐔁F"); int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(201) - 100;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		System.out.print("�ǉ�����v�f�̃C���f�b�N�X�F"); int idx = scan.nextInt();
		System.out.print("�ǉ�����v�f�F"); int x = scan.nextInt();
		aryIns(a, idx , x);
		
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}