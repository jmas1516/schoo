//�~��

import java.util.Scanner;
class Sample3_15{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����la�F"); int a = scanner.nextInt();
		System.out.print("�����lb�F"); int b = scanner.nextInt();
		
		if(a < b){
			int t = a;
			a = b;
			b = t;
		}
		
		if (a != b){
			System.out.println("a��b�ɂȂ�悤�Ƀ\�[�g���܂����B");
			System.out.println("����a��" + a + "�ł��B\n����b��" + b + "�ł��B");
		}else{
			System.out.println("��̒l�͓����ł��B");
		}
	}
}