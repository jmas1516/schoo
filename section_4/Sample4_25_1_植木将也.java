//�ǂݍ��񂾐��������Z(0�����͂��ꂽ��I��)

import java.util.Scanner;
class Sample4_25_1{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����B�F");
		int n = scanner.nextInt();
		
		int sum = 0;
		int ave = 0;
		for(int i = 1; i <= n; i++){
			System.out.print("����(0�Ŕ�����):");
			int t = scanner.nextInt();
			if(t == 0) break;
			sum += t;
			ave = (sum / i);
		}
		System.out.println("���v�F" + sum + " ���ρF" + ave );
	}
}