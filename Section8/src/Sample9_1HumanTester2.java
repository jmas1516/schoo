//クラスの人数と名前を記入し、最も背の高い人の名前を表示
import java.util.Scanner;

class Sample9_1HumanTester2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("クラスの人数："); int n = scan.nextInt();

		Sample8_1Human[] stu = new Sample8_1Human[n];

		String name;
		int grade;
		int gender;
		double height;
		for(int i = 0; i < stu.length; i++) {
			System.out.println((i + 1) + "人目");
			System.out.print("名前："); name = scan.next();
			System.out.print("学年："); grade   = scan.nextInt();
			System.out.print("性別 女性...0, 男性...1："); gender = scan.nextInt();
			System.out.print("身長[cm]：");   height = scan.nextDouble();

			stu[i] = new Sample8_1Human(name, grade, gender, height);
		}

		double tallestW = -1.0;
		String tallestNameW = "";
		double tallestM = -1.0;
		String tallestNameM = "";

		for(int i = 0; i < stu.length; i++) {
			switch(stu[i].getGender()) {
			case 0 : if(tallestW < stu[i].getHeight()) {
				     	tallestW = stu[i].getHeight();
				     	tallestNameW = stu[i].getName();
				     } break;
			case 1 : if(tallestM < stu[i].getHeight()) {
				     	tallestM = stu[i].getHeight();
				     	tallestNameM = stu[i].getName();
			         }break;
			}
		}

		System.out.println();
		if(tallestW == -1 ) {
			System.out.println("女性はいません");
		}else {
			System.out.print("最も背の高い女性は" + tallestNameW + "です");
		}

		System.out.println();
		if(tallestM == -1 ) {
			System.out.println("男性はいません");
		}else {
			System.out.print("最も背の高い男性は" + tallestNameM + "です");
		}
	}
}
