//�G�߂�\��

import java.util.Scanner;
class Sample3_18{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�G�߂��������B�m�肽�����𐮐��œ���ĂˁB:");
		int month = scanner.nextInt();
		
		switch (month){
		case 3 :;
		case 4 :;
		case 5 : System.out.println("�t");break;
		case 6 :;
		case 7 :;
		case 8 : System.out.println("��");break;
		case 9 :;
		case 10:;
		case 11: System.out.println("�H");break;
		case 12:;
		case 1 :;
		case 2 : System.out.println("�~");break;
		default: System.out.println("1�`12����͂��ĂˁB");break;
		}
	}
}
		