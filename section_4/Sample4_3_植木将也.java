//�������S���\��
import java.util.Scanner;

class Sample4_3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���la�F"); int a = scanner.nextInt();
		System.out.print("���lb�F"); int b = scanner.nextInt();
		
		int t = 0;
		if (a > b){t = a; a = b; b = t;}
		
		do{
			System.out.print(a + " ");
			a++;
		}while(a != (b+1));
	}
}