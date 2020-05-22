//®”’l‚Ì2æ
import java.util.Scanner;
class Sample4_18{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("©‘R”"); n = scanner.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n; i++)
			System.out.println(i + "‚Ì2æ‚Í" + (i * i));
	}
}