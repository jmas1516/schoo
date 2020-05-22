//Accountのテスト

public class Sample9_3AccountTester {
	public static void main(String[] args) {
		Sample9_3Day day1 = new Sample9_3Day(2020,5,10);
		Sample9_3Account adachi = new Sample9_3Account("足立幸一", "123456", 1000, day1);

		Sample9_3Day day2 = new Sample9_3Day(2020,3,20);
		Sample9_3Account nakata = new Sample9_3Account("仲田真二", "654321", 200, day2);

		adachi.withdraw(200);
		nakata.deposit(100);

		System.out.println("■足立君の口座");
		System.out.println(adachi);
		System.out.println();

		System.out.println("■仲田君の口座");
		System.out.println(nakata);
	}
}