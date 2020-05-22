//Dayコンストラクタ確認
class Sample9_2DayTester1 {

	public static void main(String[] args) {
		Sample9_2Day day1 = new Sample9_2Day();
		Sample9_2Day day2 = new Sample9_2Day(2020);
		Sample9_2Day day3 = new Sample9_2Day(2020, 5);
		Sample9_2Day day4 = new Sample9_2Day(2020, 5, 10);
		Sample9_2Day day5 = new Sample9_2Day(day4);

		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		
		if(day4.equalTo(day5)) {
			System.out.println(day5);
		}
	}
}

