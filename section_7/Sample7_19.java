////�C�ӂ̔z����폜
import java.util.Scanner;
import java.util.Random;

class Sample7_19{
	//--- �z��a����v�fa[idx]����n�폜(�]�����v�f�͂��̂܂�) ---//
	static void aryRmvN(int[] a, int idx, int n){
		for(int i = idx; i < (a.length - n); i++){
			a[i] = a[i + n];
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("�z�񐔁F"); int nIdx = scan.nextInt();
		
		int[] a = new int[nIdx];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(201) - 100;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		System.out.print("�폜����z��̃C���f�b�N�X�F"); int idx = scan.nextInt();
		System.out.print("�폜������F"); int n = scan.nextInt();
		
		aryRmvN(a, idx, n);
		
		for(int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}