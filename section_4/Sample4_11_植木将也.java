//�J�E���g�_�E��
import java.util.Scanner;
class Sample4_11{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int n;
	do{
		System.out.print("���R���F");
		n = scanner.nextInt();
	}while(n<=0);
	
	System.out.println("�J�E���g�_�E��");
	for(int i = 0; i <= n; i++)
		System.out.print(n-i + " ");
	
	}
}