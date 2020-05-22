//正の整数値を0までカウントダウン
import java.util.Scanner;
class Sample4_4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("カウントダウンします。");
		int x;
		do{
			System.out.print("正の整数値"); x = scanner.nextInt();
		}while(x <= 0);
		
		while(x >= 0){
			System.out.println(x);
			x--;
		}
		System.out.println("while後のx:" + x);
	}
}