//�C�ӂ̔z����폜
import java.util.Scanner;
import java.util.Random;

class Sample7_18{
	//--- �z��a����v�fa[idx]���폜(�����v�f�͂��̂܂�) ---//
	static void aryRmv(int[] a, int idx){
		for(int i = idx; i < (a.length - 1); i++){
			a[i] = a[i + 1];
		}
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
		
		System.out.print("�폜����z��̃C���f�b�N�X�F");
		int idx = scan.nextInt();
		aryRmv(a, idx);
		
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}