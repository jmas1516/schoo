//�ǂݍ��񂾐��������Z(0�����͂��ꂽ��I��)

import java.util.Scanner;
class Sample4_25_2{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����B�F");
		int n = scanner.nextInt();
		
		int sum = 0;
		int ave = 0;
		for(int i = 1; i <= n; i++){
			System.out.print("����:");
			int t = scanner.nextInt();
			if(sum + t > 1000) {
				System.out.println("1000�𒴂��܂����B");
				System.out.println("�Ō�̐��l�͖������܂��B");
				break;
			}
			sum += t;
			ave = (sum / i);
		}
		System.out.println("���v�F" + sum + " ���ρF" + ave );
	}
}