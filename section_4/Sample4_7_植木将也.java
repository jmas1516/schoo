//�ǂݍ��񂾒l�̌�����*+��\������
import java.util.Scanner;
class Sample4_7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("���\�����܂����H�F"); n = scanner.nextInt();
		}while(n <= 0);
		
		int i = 1;
		while (i <= n){
			if  (i % 2 ==1) System.out.print('*');
			else System.out.print('+');
			
			i++;
		}
	}
}
		