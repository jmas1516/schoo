//else if�m�F
import java.util.Scanner;
class Sample3_3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = scanner.nextInt();
		
		if (n > 0)
			System.out.println("���̒l�͐��ł��B");
		else if (n < 0)
			System.out.println("���̒l�͕��ł��B");
		else if (n == 0)
			System.out.println("���̒l��0�ł��B");
	}
}

//�Ō��else if (n == 0)�ɂ��Ă����s�\