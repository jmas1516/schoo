//�V���b�t��

import java.util.Scanner;
import java.util.Random;

class Sample6_12{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("�v�f���F"); final int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = scan.nextInt();
		}
		// 0����(n-1)�܂ł̐��������_���ɐ���(�d���Ȃ�)
		int[] b = new int[n]; 
		for(int i = 0; i < n; i++){
			do{
				b[i] = rand.nextInt(n);
				
				for(int j = 0; j < i; j++)
					if(b[i] == b[j]) b[i] = -1;
				
			}while(i > 0 && b[i] == -1);
		}
		
		//�R�����g
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = " + a[i] + " ");
			if(i % 5 == 4) System.out.println();
		}
		System.out.println();
		System.out.println("�V���b�t�����܂�");
		
		//����
		int[] c = new int[n];
		for(int i = 0; i < n; i++)
			c[i] = a[b[i]];
		for(int i = 0; i < n; i++)
			a[i] = c[i];
			
		//�R�����g
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = " + a[i] + " ");
			if(i % 5 == 4) System.out.println();
		}
	}
}