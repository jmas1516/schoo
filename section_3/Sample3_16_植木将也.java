//����

import java.util.Scanner;
class Sample3_16{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����la�F"); int a = scanner.nextInt();
		System.out.print("�����lb�F"); int b = scanner.nextInt();
		System.out.print("�����lc�F"); int c = scanner.nextInt();
		
		int t;
		if(a <= b && a <= c){
			if(b >= c){t = b; b = c; c = t;}
		}else if (b <= c && b <= a){
			t = a; a = b; b = t;
			if(b >= c){t = b; b = c; c = t;}
		}else{
			t = a; a = c; c = t;
			if(b >= c){t = b; b = c; c = t;}
		}
		
		System.out.println("a��b��c�ɂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ�a��" + a + "�ł��B\n�ϐ�b��" + b + "�ł��B\n�ϐ�c��" + c + "�ł��B");
	}
}