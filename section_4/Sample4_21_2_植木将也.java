//���p�O�p�`no.2
import java.util.Scanner;
class Sample4_21_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("��ӂ����"); n = scanner.nextInt();
		}while (n <= 0);
		
		System.out.println("���p���E���Œ�ӁA������" + n + "�̒��p�O�p�`");
		
		for(int i = 1; i <= n; i++){
			for(int j = n; j > i; j--){
				System.out.print(' ');
			}
			for(int j = 1; j <= i; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}