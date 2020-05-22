//残りの積載量を表示
import java.util.Scanner;

public class Sample8_2CarTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Sample8_2Car myCar = new Sample8_2Car("くるま", 1660, 1500, 3640, 40.0, 1265.0);

		System.out.print("荷物の重さ[kg]："); double x = scan.nextDouble();
		System.out.print("大人の人数"); int adults = scan.nextInt();
		System.out.print("子供の人数"); int kids   = scan.nextInt();



		double load = myCar.remainingLoad(x, adults, kids);
		if(load < 0)
			System.out.println("積載量オーバー");
		else if(load == 0)
			System.out.println("これ以上載せられません");
		else
			System.out.println("あと" + load + "kg載せることができます");

	}

}
