//¢
import java.util.Scanner;
class Sample4_23{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("©‘R”F"); n = scanner.nextInt();
		}while(n <= 0);
		
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= (n-i); j++)
				System.out.print(" ");
			
			for(int j = 1; j <= (2 * i -1); j++)
				System.out.print(i % 10);
			
			System.out.println();
		}
	}
}