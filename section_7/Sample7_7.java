//���p�O�p�`

import java.util.Scanner;

class Sample7_7{
	
	//--- ����c��n�\�� ---//
	static void putChars(char c, int n){
		while (n-- > 0)
			System.out.print(c);
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������p�̎O�p�`��\�����܂�");
		System.out.print("�i���� : "); int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++){
			putChars('*', i);
			System.out.println();
		}
	}
}