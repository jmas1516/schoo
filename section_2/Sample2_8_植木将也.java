//���͂����l�}5�̗����\��
import java.util.Scanner;
import java.util.Random;
	class Sample2_8{
		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			Random  rand  = new Random();
			
			System.out.print("���l����͂��Ă��������F");
			int x = stdIn.nextInt();
			
			int y = rand.nextInt(10);
			
			System.out.println("���̒l�́}5�̗����𐶐����܂����B�����" + (x-5+y) + "�ł��B");
		}
	}
