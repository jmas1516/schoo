//�J�E���g�A�b�v
import java.util.Scanner;
class Sample4_12{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int n;
	do{
		System.out.print("���R���F");
		n = scanner.nextInt();
	}while(n<=0);
	
	System.out.println("�J�E���g�A�b�v");
	for(int i = 0; i <= n; i++)
		System.out.print(i + " ");
	
	}
}