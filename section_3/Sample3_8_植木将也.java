//成績判定
import java.util.Scanner;
class Sample3_8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0〜100の整数を入力：");
		int n = scanner.nextInt();
		
		if (n >= 0 && n <= 100){
			if (n>=0 && n <60)
				System.out.println("不可");
			else if (n >= 60 && n < 70)
				System.out.println("可");
			else if (n >=70 && n < 80)
				System.out.println("良");
			else
				System.out.println("優");
		}else
			System.out.println("正しくない値が入力されました");
	}
}
			