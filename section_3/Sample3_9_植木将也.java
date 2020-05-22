//読み込んだ2つの整数値の大きいほうの値を表示

import java.util.Scanner;
class Sample3_9{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数a："); double a = stdIn.nextDouble();
		System.out.print("実数b："); double b = stdIn.nextDouble();
		
		System.out.println("大きいほうの値は" + (a > b ? a : b) + "です。");
	}
}