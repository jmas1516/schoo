//���͂����l����O�p�`�̖ʐς����߂�
import java.util.Scanner;

class Sample2_6{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�O�p�`�̖ʐς����߂܂�");
		
		System.out.print("��ӁF");
		double x = stdIn.nextDouble();
		System.out.print("�����F");
		double h = stdIn.nextDouble();
		
		System.out.println("�ʐς�" + (x * h / 2) + "�ł�");
	}
}
