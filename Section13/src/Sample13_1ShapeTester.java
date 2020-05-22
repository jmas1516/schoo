package Shape;

import java.util.Scanner;

public class Sample13_1ShapeTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Sample13_1Shape[] p = new Sample13_1Shape[8];

		System.out.print("直線の長さ：");  int length = scan.nextInt();
		System.out.print("長方形の幅：");  int width = scan.nextInt();
		System.out.print("長方形の高さ："); int height = scan.nextInt();

		p[0] = new Sample13_1Point();
		p[1] = new Sample13_1VertLine(length);
		p[2] = new Sample13_1HorzLine(length);
		p[3] = new Sample13_1Rectangle(width, height);
		p[4] = new Sample13_2TriUpL(length);
		p[5] = new Sample13_2TriUpR(length);
		p[6] = new Sample13_2TriLowL(length);
		p[7] = new Sample13_2TriLowR(length);

		for(Sample13_1Shape s : p) {
			s.print();
			System.out.println();
		}
		scan.close();
	}
}
