import java.util.Scanner;
class Sample3_5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���l�F");
		int n = scanner.nextInt();
		
		if (n <= 0)
			System.out.println("���łȂ��l�����͂���܂����B");
			
		else if (n % 5 == 0)
			System.out.println("���̒l��5�Ŋ���؂�܂��B");
		else
			System.out.println("���̒l��5�Ŋ���؂�܂���B");
	}
}
		