//��Βl
import java.util.Scanner;
class Sample3_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int x = scanner.nextInt();
		
		if (x >= 0)
			System.out.println("���̐�Βl�́F" + x + "�ł��B");
		else
			System.out.println("���̐�Βl�́F" + (-x) + "�ł��B");
	}
}