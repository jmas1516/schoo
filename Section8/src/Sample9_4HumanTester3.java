
public class Sample9_4HumanTester3 {
	public static void main(String[] args) {

		Sample9_2Day birthday = new Sample9_2Day(2010, 12, 27);
		Sample8_1Human uekino = new Sample8_1Human("Uekino", 2, 1, 150, birthday);

		System.out.println(uekino.getBirthday());
		uekino.toString();
	}
}
