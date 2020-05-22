//進数
import java.util.Scanner;

class Sample5_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数："); int n = scanner.nextInt();
		
		System.out.print("8進数:");
		System.out.printf("n = %o\n", n); //８進数
		
		System.out.print("16進数:");
		System.out.printf("n = %x\n", n); //16進数
	}
}