//�񐔔���
import java.util.Scanner;
class Sample3_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� A�F");
		int a = scanner.nextInt();
		
		System.out.print("���� B�F");
		int b = scanner.nextInt();
		
		if (a % b == 0)
			System.out.println("B��A�̖񐔂ł��B");
		else
			System.out.println("B��A�̖񐔂ł͂���܂���B");
	}
}