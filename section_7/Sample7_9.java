//正の値のみ返却
import java.util.Scanner;

class Sample7_9{
	static Scanner scan = new Scanner(System.in);
	
	//--- 正の値のみ返却 ---//
	static int readPlusInt(){
		int n;
		do{
			System.out.print("正の整数：");
			n = scan.nextInt();
		}while(n <= 0);
		return n;
	}
	
	public static void main(String[] args){
		System.out.println(readPlusInt());
	}
}
