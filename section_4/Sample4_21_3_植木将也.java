//’¼ŠpŽOŠpŒ`no.2
import java.util.Scanner;
class Sample4_21_3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("’ê•Ó‚ð“ü—Í"); n = scanner.nextInt();
		}while (n <= 0);
		
		System.out.println("’¼Šp‚ª‰Eã‚Å’ê•ÓA‚‚³‚ª" + n + "‚Ì’¼ŠpŽOŠpŒ`");
		
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < i; j++){
				System.out.print(' ');
			}
			for(int j = n; j >= i; j--){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}