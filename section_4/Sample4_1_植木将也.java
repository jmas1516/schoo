//do while

import java.util.Scanner;
class Sample4_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int retry;
		
		do{
			System.out.print("�����l�F"); int n = scanner.nextInt();
			
			
			if (n > 0)
				System.out.println("���̒l�͐��ł�");
			else if (n < 0)
				System.out.println("���̒l�͕��ł�");
			else 
				System.out.println("���̒l��0�ł�");
			
			System.out.print("������x���Hyes �� 1, no �� 0 :");
			retry = scanner.nextInt();
		} while (retry == 1);
	}
}