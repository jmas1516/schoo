//�����`����肽�[�[�[��

import java.util.Scanner;
class Sample4_20{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("�����`�̕ӂ̒���"); n = scanner.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}