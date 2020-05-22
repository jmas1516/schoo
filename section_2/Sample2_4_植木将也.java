import java.util.Scanner;

class Sample2_4{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int x = stdIn.nextInt();
		
		System.out.println("10を加えた値は：" + (10 + x));
		System.out.println("10を引いた値は：" + (x - 10));
	}
}
