//3�̐����̍ŏ��l

import java.util.Scanner;
class Sample3_12{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����a�F"); int a = scanner.nextInt();
		System.out.print("����b�F"); int b = scanner.nextInt();
		System.out.print("����c�F"); int c = scanner.nextInt();
		
		int min = a < b ? a : b;
		
		System.out.println("�ŏ��l�F" + (min < c ? min:c));
	}
}