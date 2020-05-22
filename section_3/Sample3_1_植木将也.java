//絶対値
import java.util.Scanner;
class Sample3_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数値：");
		int x = scanner.nextInt();
		
		if (x >= 0)
			System.out.println("その絶対値は：" + x + "です。");
		else
			System.out.println("その絶対値は：" + (-x) + "です。");
	}
}