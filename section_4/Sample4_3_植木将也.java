//あいだ全部表示
import java.util.Scanner;

class Sample4_3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("数値a："); int a = scanner.nextInt();
		System.out.print("数値b："); int b = scanner.nextInt();
		
		int t = 0;
		if (a > b){t = a; a = b; b = t;}
		
		do{
			System.out.print(a + " ");
			a++;
		}while(a != (b+1));
	}
}