//浮動小数点
import java.util.Scanner;

class Sample5_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("変数xはfloat型、変数yはdouble型です。");
		System.out.print("x:"); float  x = scanner.nextFloat();
		System.out.print("y:"); double y = scanner.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}