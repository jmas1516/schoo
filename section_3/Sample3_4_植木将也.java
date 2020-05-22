//2数の大小を判定
import java.util.Scanner;
class Sample3_4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数値 a：");
		int a = scanner.nextInt();
		
		System.out.print("整数値 b：");
		int b = scanner.nextInt();
		
		if (a > b)
			System.out.println("aのほうが大きいです。");
		else if (a == b)
			System.out.println("aとbは同じ値です。");
		else
			System.out.println("bのほうが大きいです。");
	}
}