import java.util.Scanner;
public class Sample9_5PeriodTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("開始 年："); int fromY = scan.nextInt();
		System.out.print("開始 月："); int fromM = scan.nextInt();
		System.out.print("開始 日："); int fromD = scan.nextInt();
		
		System.out.print("期限 年："); int toY = scan.nextInt();
		System.out.print("期限 月："); int toM = scan.nextInt();
		System.out.print("期限 日："); int toD = scan.nextInt();
		
		Sample9_5Day from = new Sample9_5Day(fromY, fromM, fromD);
		Sample9_5Day to   = new Sample9_5Day(toY  , toM  , toD  );
		
		Sample9_5Period period = new Sample9_5Period(from, to);
		
		System.out.println(period);
	}

}
