//入力した名前を表示
import java.util.Scanner;

class Sample2_10{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("姓：");
		String lastName = scanner.next();
		
		System.out.print("名：");
		String firstName = scanner.next();
		
		System.out.println(lastName + firstName);
	}
} 