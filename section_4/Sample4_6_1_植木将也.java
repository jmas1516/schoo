//�ǂݍ��񂾌�����*��\��

import java.util.Scanner;
class Sample4_6_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����*��\�����܂����H�F");
		int n = scanner.nextInt();
		
		int i = 0;
		while (n > 0 && i < n) {
			System.out.print('*');
			i++;
		}
	}
}