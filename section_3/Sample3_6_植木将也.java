import java.util.Scanner;
class Sample3_6{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����F");
		int n = scanner.nextInt();
		
		if (n > 0)
			if (n % 5 != 0)
				System.out.println("���̒l��10�̔{���ł͂���܂���");
			else
				System.out.println("���̒l��10�̔{���ł��B");
		else
			System.out.println("���łȂ��l�����͂���܂����B");
	}
}