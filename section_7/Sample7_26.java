//�v�f�̑}��
import java.util.Scanner;
import java.util.Random;

class Sample7_26{
	static Scanner scan = new Scanner(System.in);
	static Random  rand = new Random();
	
	//--- a[idx] ��x��}�������z��b��ԋp ---//
	static int[] arrayInsOf(int[] a, int idx, int x){
		int[] b;
		if(idx < 0 || idx >= a.length){
			return a;
		}else{
			b = new int[a.length + 1];
			for(int i = 0, j = 0; i < a.length; i++){
				if(a[idx] == a[i]){
					b[idx] = x;
					j++;
				}
				b[j] = a[i];
				j++;
			}return b;
		}
	}
	
	public static void main(String[] args){
		//�z��a����
		int len;
		do{
			System.out.print("�z��a�̗v�f��len�F"); len = scan.nextInt();
		}while(len <= 0);
		int a[] = new int[len];
		
		//�v�f���
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(100);
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		//�ǉ�
		System.out.print("�ǉ�����C���f�b�N�X(0�ȏ�" + (a.length - 1) + "�ȉ�)�F");
		int idx = scan.nextInt();
		System.out.print("�ǉ�����v�f�̒l�F");
		int x   = scan.nextInt();
		int[] b = arrayInsOf(a, idx, x);
		
		if(a.length == b.length){
			System.out.println("�ǉ��ł��܂���ł���");
		}else{
			System.out.println("�ǉ����܂���");
			for(int i = 0; i < b.length; i++){
				System.out.println("a[" + i + "] = " +  b[i]);
			}
		}
	}
}