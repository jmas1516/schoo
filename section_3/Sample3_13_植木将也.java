//3�̐����̒����l

import java.util.Scanner;
class Sample3_13{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����a�F"); int a = scanner.nextInt();
		System.out.print("����b�F"); int b = scanner.nextInt();
		System.out.print("����c�F"); int c = scanner.nextInt();
		
		int mid = a;
		
		if (a >= b){
			if (c >= a)     mid = a;
			else if (c <= b) mid = b;
			else            mid = c;
		}else{
			if(c >= b)      mid = b;
			else if(c <= a)  mid = a;
			else            mid = c;
		}
		System.out.println("�����l�F" + mid);
	}
}