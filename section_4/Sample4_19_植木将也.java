//���͂��ꂽ���̕\��

import java.util.Scanner;
class Sample4_19{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int retry;
		
		do {
			int month;
			do{
				System.out.print("�G�߂����߂܂��B\n�����ł����H�F");
				month = scanner.nextInt();
			}while(month <= 0 || month >= 13);
			
			if (month >= 3 && month <= 5)
				System.out.println("�t");
			else if (month >= 6 && month <= 8)
				System.out.println("��");
			else if (month >= 9 && month <= 11)
				System.out.println("�H");
			else if (month == 12 || month == 1 || month == 2)
				System.out.println("�~");
			
			System.out.print("������x�H 1...Yes/ 2...No");
			retry = scanner.nextInt();
		}while (retry == 1);
	}
}