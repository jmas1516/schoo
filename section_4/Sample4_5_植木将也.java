//���̐����l��0�܂ŃJ�E���g�_�E��
import java.util.Scanner;
class Sample4_5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�J�E���g�_�E�����܂�.");
		int x;
		do {
			System.out.print("���̐����l:");
			x = scanner.nextInt();
		}while (x <= 0);
		
		int y = x;
		while(x >= 0){
			System.out.println("x-- : " + x-- + " --x : " + --y);
		}
	}
}
			