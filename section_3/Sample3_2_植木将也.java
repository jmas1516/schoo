//約数判定
import java.util.Scanner;
class Sample3_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数 A：");
		int a = scanner.nextInt();
		
		System.out.print("整数 B：");
		int b = scanner.nextInt();
		
		if (a % b == 0)
			System.out.println("BはAの約数です。");
		else
			System.out.println("BはAの約数ではありません。");
	}
}