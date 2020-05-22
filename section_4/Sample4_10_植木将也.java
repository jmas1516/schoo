//読み込んだ個数だけ*を表示
import java.util.Scanner;
class Sample4_10{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("何個*を表示しますか？：");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++){
			System.out.print('*');
			if (i == n-1) System.out.println();
		}
	}
}