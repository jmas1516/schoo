//�z��a�ŗv�f�̒l��x�ł���v�f�̃C���f�b�N�X��\��
import java.util.Scanner;
import java.util.Random;

class Sample7_23{
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	//--- �z��a�̗v�f�̒lx�̃C���f�b�N�Xidx ---//
	static int[] arraySrchIdx(int[] a, int x){
		int n = 0;     // a�Ɋ܂܂��x�̐�
		int[] idx; // x�̃C���f�b�N�X
		for(int i = 0; i < a.length; i++){
			if(a[i] == x) n++;
		}
		if(n == 0){
			return idx = new int[]{-1};
		}
		else{
			idx = new int[n];
			int j = 0;
			for(int i = 0; i < a.length; i++){
				if(a[i] == x){
					idx[j] = i;
					j++;
				}
			}
			return idx;
		}
	}
	
	public static void main(String[] args){
		
		int[] a = new int[20];
		
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(10);
			System.out.print("a[" + i + "] = " + a[i]);
			System.out.println();
		}
		
		System.out.print("�T���l�F");
		int x = scan.nextInt();
		int[] idx  = arraySrchIdx(a, x);
		
		if(idx[0] == -1){
			System.out.println("���̒l�͂���܂���");
		}else{
			System.out.print("���̒l�̗v�f�̃C���f�b�N�X��{");
			for(int i = 0; i < idx.length; i++){
				System.out.print(idx[i]);
				if(i == (idx.length - 1)) break;
				System.out.print(", ");
			}
			System.out.println("}�ł�");
		}
	}
}