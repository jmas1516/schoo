//入力した値から三角形の面積を求める
import java.util.Scanner;

class Sample2_6{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("三角形の面積を求めます");
		
		System.out.print("底辺：");
		double x = stdIn.nextDouble();
		System.out.print("高さ：");
		double h = stdIn.nextDouble();
		
		System.out.println("面積は" + (x * h / 2) + "です");
	}
}
