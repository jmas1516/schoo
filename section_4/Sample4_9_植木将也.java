//�啶���̃p�C

import java.util.Scanner;
class Sample4_9{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("���R������͂��ĉ������F");
			n = scanner.nextInt();
		}while(n<=0);
		
		int product = 1;//��
		int i = 1;
		while(i <= n){
			product *= i;
			i++;
		}
		System.out.println("1����" + n +"�܂ł̐ς�" + product +"�ł�");
	}
}