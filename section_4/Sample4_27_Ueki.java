//�����ăQ�[��Ver.2

import java.util.Random;
import java.util.Scanner;

class Sample4_27{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random  rand    = new Random();
		
		int n = 1 + rand.nextInt(100);
		
		System.out.println("1�`100�̐��������𓖂Ă�");
		System.out.println("6��ŕ�����Ȃ���΃Q�[���I�[�o�[");
		
		int x;
		
		for(int i = 6; i > 0; i--){
			
			System.out.println("����" + i + "�񒧐�\");
			
			if(i == 2){
				if     (n % 3 == 0 && n % 2 == 0) System.out.println("�q���g�F3�̔{���ŋ�������");
				else if(n % 3 == 0 && n % 2 == 1) System.out.println("�q���g�F3�̔{���Ŋ����");
				else if(n % 3 != 0 && n % 2 == 0) System.out.println("�q���g�F������3�̔{���ł͂Ȃ���");
				else                              System.out.println("�q���g�F���3�̔{���ł͂Ȃ���");
			}
			System.out.println("���������:"); x = scanner.nextInt();
			
			if(x == n ){
				System.out.println("�吳���I�I�������ˁI�I"); 
				break;
			}
			if(i == 1 ){
				System.out.println("�Q�[���I�[�o�[\n������" + n + "�ł����B�܂����킵�Ă�!");
				break;
			}
			if(x > n) System.out.println("�����Ə�����");
			else      System.out.println("�����Ƒ傫��");
		}
	}
}