//�z��a����v�fa[idx]��擪��n�폜�����z���ԋp
import java.util.Scanner;
import java.util.Random;

class Sample7_25{
	static Scanner scan = new Scanner(System.in);
	static Random  rand = new Random();
	
	//--- �z��a����v�fa[idx]��擪��n�폜�����z���ԋp ---//
	//--- �S�č폜����ꍇ�A�擪�̗v�f�݂̂̔z���ԋp     ---//
	static int[] arrayRmvIdxN(int[] a, int idx, int n){
		//int[] b�̔z�񐔊m��
		int[] b;
		if(idx == 0 && n >= a.length){
			b = new int[]{a[0]};
		}else if(idx >= a.length || idx < 0){
			b = new int[a.length]; 
		}else if((idx + n) > a.length){
			b = new int[idx];
		}else{
			b = new int[a.length - n];
		}
		
		//int[] b�֗v�f����
		if(idx == 0 && n >= a.length);
		else if(idx >= a.length || idx < 0){
			for(int i = 0; i < a.length; i++){
				b[i] = a[i];
			}
		}else{
			for(int i = 0, j = 0; i < a.length; i++){
				if(a[i] == a[idx]){
					i += (n - 1);
					continue;
				}
				b[j] = a[i];
				j++;
			}
		}return b;
	}
	
	public static void main(String[] args){
		//�z��a����
		int len;
		do{
			System.out.print("�z��a�̗v�f��len�F");len = scan.nextInt();
		}while(len <= 0);
		int a[] = new int[len];
		
		//�v�f���
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(100);
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		//�폜
		System.out.print("�폜����v�f�̐擪�̃C���f�b�N�X�F");
		int idx = scan.nextInt();
		System.out.print("�폜������F");
		int n   = scan.nextInt();
		int[] b = arrayRmvIdxN(a, idx, n);
		
		System.out.println("�폜���܂���");
		for(int i = 0; i < b.length; i++){
			System.out.println("a[" + i + "] = " +  b[i]);
		}
	}
}