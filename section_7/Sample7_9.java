//���̒l�̂ݕԋp
import java.util.Scanner;

class Sample7_9{
	static Scanner scan = new Scanner(System.in);
	
	//--- ���̒l�̂ݕԋp ---//
	static int readPlusInt(){
		int n;
		do{
			System.out.print("���̐����F");
			n = scan.nextInt();
		}while(n <= 0);
		return n;
	}
	
	public static void main(String[] args){
		System.out.println(readPlusInt());
	}
}
