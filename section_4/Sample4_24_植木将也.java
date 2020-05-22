//‘f””»’è

import java.util.Scanner;
class Sample4_24{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("2ˆÈã‚Ì©‘R”F"); n = scanner.nextInt();
		}while(n <= 1);
		
		for (int i = 2; i <= n; i++){
			if(i == n){
				System.out.println("‘f”‚Å‚·"); break;
			}
			if(n % i == 0){ 
				System.out.println("‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñ"); break;
			}
		}
	}
}
	