//�ǂݍ��񂾌�����*��\��

import java.util.Scanner;

class Sample4_6_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����*��\�����܂����H�F"); int n = scanner.nextInt();
		
		int i = 1;
		while (n > 0 && i <= n){
			System.out.print('*');
			i++;
		}
	}
}