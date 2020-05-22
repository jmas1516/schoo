
public class Sample10_4DayTester {

	public static void main(String[] args) {
		Sample10_4Day day1 = new Sample10_4Day(2020, 13, 32);
		Sample10_4Day day2 = new Sample10_4Day(2000, 2, 30);

		System.out.println(day1);
		System.out.println(day2);

		System.out.println("年内の経過日数：" + day2.pass());
		System.out.println("残りの日数    ：" + day2.rem());

		System.out.println(day2 + "は" + day1 + day2.relation(day1));
	}

}
