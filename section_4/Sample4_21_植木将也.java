//���p�O�p�`no.1
import java.util.Scanner;
class Sample4_21{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("��ӂ����"); n = scanner.nextInt();
		}while (n <= 0);
		
		System.out.println("���p������Œ�ӁA������" + n + "�̒��p�O�p�`");
		
		for(int i = 0; i < n; i++){
			for(int j = n; j > i; j--){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}