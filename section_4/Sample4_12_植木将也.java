//カウントアップ
import java.util.Scanner;
class Sample4_12{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int n;
	do{
		System.out.print("自然数：");
		n = scanner.nextInt();
	}while(n<=0);
	
	System.out.println("カウントアップ");
	for(int i = 0; i <= n; i++)
		System.out.print(i + " ");
	
	}
}