//���є���
import java.util.Scanner;
class Sample3_8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0�`100�̐�������́F");
		int n = scanner.nextInt();
		
		if (n >= 0 && n <= 100){
			if (n>=0 && n <60)
				System.out.println("�s��");
			else if (n >= 60 && n < 70)
				System.out.println("��");
			else if (n >=70 && n < 80)
				System.out.println("��");
			else
				System.out.println("�D");
		}else
			System.out.println("�������Ȃ��l�����͂���܂���");
	}
}
			