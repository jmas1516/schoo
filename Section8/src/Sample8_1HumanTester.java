//成績、進学
import java.util.Scanner;

public class Sample8_1HumanTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("名前："); String name = scan.next();
		System.out.print("学年："); int grade   = scan.nextInt();
		System.out.print("性別 女性...0, 男性...1："); int gender = scan.nextInt();
		System.out.print("身長[cm]：");   double height = scan.nextDouble();

		Sample8_1Human student = new Sample8_1Human(name, grade, gender, height);

		System.out.print("テストの点数："); int test = scan.nextInt(); //0以上100以下
		if(student.advancement(test)) {
			if(student.getGrade() == 4) System.out.println("卒業おめでとう");
			else System.out.println("進級おめでとう");
		}else {
			System.out.println("留年");
		}

		student.gradebook();
	}
}