//�z��a����v�fa[idx]���폜
import java.util.Scanner;
import java.util.Random;

class Sample7_24{
	static Scanner scan = new Scanner(System.in);
	static Random  rand = new Random();
	//--- �z��a�̗v�fa[idx]���폜 ---//
	static int[] arrayRmvOf(int[] a, int idx){
		int[] b;
		if(a.length == 1 && idx == 0) b = new int[]{0};
		else if(idx > (a.length - 1) ) b = a;
		else{
			 b = new int[a.length -1];
			 	int j = 0;
			 	for(int i = 0; i < a.length; i++){
			 		if(i == idx) continue;
			 		b[j] = a[i];
			 		j++;
			 	}
		}
		return b;
	}
	
		public static void main(String[] args){
			int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(100);
			System.out.print("a[" + i + "] = " + a[i]);
			System.out.println();
		}
		
		System.out.print("�폜����v�f�̃C���f�b�N�X�F");
		int idx = scan.nextInt();
		
		int[] b = arrayRmvOf(a, idx); 
		
		System.out.println("�폜��̔z��a");
		for(int i = 0; i < b.length; i++){
			System.out.println("a[" + i + "] = " + b[i]);
		}
	}
}