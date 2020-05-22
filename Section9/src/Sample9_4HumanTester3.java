
public class Sample9_4HumanTester3 {
	public static void main(String[] args) {
		Sample9_4Day birthday = new Sample9_4Day(2010, 12, 27);
		Sample9_4Human stu1   = new Sample9_4Human("Uekino", 2, 1, 150, birthday);
		
		System.out.println(stu1.getBirthday());
		System.out.println(stu1);
	}

}
