//2�̐����̍��𔻒�

import java.util.Scanner;
class Sample3_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F"); int a = stdIn.nextInt();
		System.out.print("����b�F"); int b = stdIn.nextInt();
		
		int c = a-b;
		
		if (c>=-10 && c<=10)
			System.out.println("�����̍���10�ȉ��ł��B");
		else
			System.out.println("�����̍���11�ȏ�ł��B");
	}
}