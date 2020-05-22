//’¼ŠpŽOŠpŒ`no.1
import java.util.Scanner;
class Sample4_21{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("’ê•Ó‚ð“ü—Í"); n = scanner.nextInt();
		}while (n <= 0);
		
		System.out.println("’¼Šp‚ª¶ã‚Å’ê•ÓA‚‚³‚ª" + n + "‚Ì’¼ŠpŽOŠpŒ`");
		
		for(int i = 0; i < n; i++){
			for(int j = n; j > i; j--){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}