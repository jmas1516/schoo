//�����ăQ�[��

import java.util.Scanner;
import java.util.Random;

class Sample4_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random  rand    = new Random();
		
		int x = 10 + rand.nextInt(90);
		
		System.out.println("�����ăQ�[���J�n�I");
		System.out.println("10�`99�̐��𓖂ĂĂ�");
		
		int n;
		do{
			System.out.println("��������:");
			n = scanner.nextInt();
			
			if      (n > x) System.out.println("�����Ə�������");
			else if (n < x) System.out.println("�����Ƒ傫����");
		}while (n != x);
		System.out.println("�����B�撣������");
	}
}