//�ǂݍ��񂾐��������Z(0�����͂��ꂽ��I��)

import java.util.Scanner;
class Sample4_26{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����B�F");
		int n = scanner.nextInt();
		
		int sum = 0, ave = 0, j = 0;
		for(int i = 1; i <= n; i++){
			System.out.print("����:");
			int t = scanner.nextInt();
			if ( t < 0){
				System.out.println("���̐��͉��Z���܂���B");
				j--;
				continue;
			}
			sum += t;
			if (i != j) ave = sum /(i-j);
		}
		System.out.println("���v:" + sum + " ����:" + ave);
	}
}