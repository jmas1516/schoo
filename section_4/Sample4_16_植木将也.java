//*表示【改】

import java.util.Scanner;
class Sample4_16{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*を何個表示しますか？：");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++){
			if(i % 5 == 0)
				System.out.println('*');
			else
				System.out.print('*');
		}
	}
}