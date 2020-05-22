import java.util.Scanner;
class Sample3_5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("数値：");
		int n = scanner.nextInt();
		
		if (n <= 0)
			System.out.println("正でない値が入力されました。");
			
		else if (n % 5 == 0)
			System.out.println("その値は5で割り切れます。");
		else
			System.out.println("その値は5で割り切れません。");
	}
}
		