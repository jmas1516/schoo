//���͂����������R�Ŋ������]������߂�

import java.util.Scanner;
class Sample3_7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���R���F");
		int n = scanner.nextInt();
		int m = n % 3;
		
		if (n > 0)
			if (m == 0)
				System.out.println("���̒l��3�Ŋ���؂�܂�");
			else if (m == 1)
				System.out.println("���̒l��3�Ŋ������]���1�ł�");
			else
				System.out.println("���̒l��3�Ŋ������]���2�ł�");
		else
			System.out.println("���łȂ��l�����͂���܂���");
	}
}
				