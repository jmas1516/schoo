//�f������

import java.util.Scanner;
class Sample4_24{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("2�ȏ�̎��R���F"); n = scanner.nextInt();
		}while(n <= 1);
		
		for (int i = 2; i <= n; i++){
			if(i == n){
				System.out.println("�f���ł�"); break;
			}
			if(n % i == 0){ 
				System.out.println("�f���ł͂���܂���"); break;
			}
		}
	}
}
	