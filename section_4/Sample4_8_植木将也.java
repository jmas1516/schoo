//������ǂݎ��
import java.util.Scanner;
class Sample4_8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("���R�������");
			n = scanner.nextInt();
		}while(n<=0);
		
		int i = 0;
		while(n > 0){
			n /= 10;
			i++;
		}
		System.out.println("������" + i + "�ł�");
	}
}