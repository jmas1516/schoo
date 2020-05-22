//読み込んだ個数だけ*を表示

import java.util.Scanner;
class Sample4_6_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("何個*を表示しますか？：");
		int n = scanner.nextInt();
		
		int i = 0;
		while (n > 0 && i < n) {
			System.out.print('*');
			i++;
		}
	}
}