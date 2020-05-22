//‘˜a
import java.util.Scanner;
class Sample4_13{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int n;
	do{
		System.out.print("©‘R”F");
		n = scanner.nextInt();
	}while(n<=0);
	
	System.out.println("‘˜a");
	int sum = 0;
	for(int i = 1; i <= n; i++)
		sum += i;
	
	System.out.println("1‚©‚ç" + n + "‚Ü‚Å‚Ì‘˜a‚Í" + sum + "‚Å‚·");
	}
}