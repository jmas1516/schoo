package sample;

public class Sample12_2TimeAcountTester {

	public static void main(String[] args) {
		Sample12_2Account a = new Sample12_2Account("aaa", "101", 120000);
		Sample12_2TimeAccount b = new Sample12_2TimeAccount("bbb", "102", 20000, 100000);

		int comp = Sample12_2TimeAccount.compBalance(a, b);

		System.out.println("口座の貯金額");
		if(comp == 1) {
			System.out.println("a > b");
		}else if(comp == -1) {
			System.out.println("a < b");
		}else {
			System.out.println("a = b");
		}

		System.out.println("預金をすべてキャンセル");
		b.cancel();

		comp = Sample12_2TimeAccount.compBalance(a, b);

		System.out.println("口座の貯金額");
		if(comp == 1) {
			System.out.println("a > b");
		}else if(comp == -1) {
			System.out.println("a < b");
		}else {
			System.out.println("a = b");
		}

	}

}
