//2�̐����̍���\��

import java.util.Scanner;
class Sample3_10{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F"); int a = stdIn.nextInt();
		System.out.print("����b�F"); int b = stdIn.nextInt();
		
		int c = a-b;
		
		if (c < 0)
			System.out.println("���F" + -c);
		else
			System.out.println("���F" + c);
	}
}