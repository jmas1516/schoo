//2���̑召�𔻒�
import java.util.Scanner;
class Sample3_4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����l a�F");
		int a = scanner.nextInt();
		
		System.out.print("�����l b�F");
		int b = scanner.nextInt();
		
		if (a > b)
			System.out.println("a�̂ق����傫���ł��B");
		else if (a == b)
			System.out.println("a��b�͓����l�ł��B");
		else
			System.out.println("b�̂ق����傫���ł��B");
	}
}