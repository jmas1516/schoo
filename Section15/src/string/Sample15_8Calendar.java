package calender;

import java.util.Calendar;

public class Sample15_8Calendar {
	static Calendar  cal = Calendar.getInstance();

	public int   y;  //年
	public int   m;  //月

	public int[] mm = new int[12]; //月の配列


	//---コンストラクタ---//
	public Sample15_8Calendar() {
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH) + 1;
	}

	public Sample15_8Calendar(int y) {
		this.y = y;
		for(int i = 0; i < mm.length; i++) {
			mm[i] = (i + 1);
		}
	}

	public Sample15_8Calendar(int y, int m) {
		this.y = y;
		this.m = m;
	}

	//---ゲッタ---//
	public int getY() {
		return y;
	}

	public int getM() {
		return m;
	}
	//---閏年判定---//
	public static boolean isLeap(int y) {
		if(y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
			return true;
		}
		return false;
	}

	//---月の最終日---//
	public int lastDay(int y, int m) {
		if(isLeap(y) && m == 2) {
			return 29;
		}
		if(m == 2) {
			return 28;
		}
		if(m == 4 || m == 6 || m == 9 || m == 11) {
			return 30;
		}
		return 31;
	}

	//---m月1日の曜日判定---//
	public int firstDay(int y, int m) {
		cal.set(y, m - 1, 1);
		return cal.get(Calendar.DAY_OF_WEEK); //1:日, 2:月 , ... , 7:土
	}

	//---日付配列---//
	public void cld(int firstDay, int lastDay){ //firstDay:1日の曜日, lastDay:最終日
		System.out.println("日 月 火 水 木 金 土");
		for(int j = 1; j < firstDay; j ++) {
			System.out.print("   ");
		}
		for(int i = 1; i <= lastDay; i++) {
			System.out.printf("%2d ", i);
			if((i + firstDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
	}

	//---日付配列1年---//
	public void cldAll() {
		System.out.println(y + "年");
		for(int i = 0; i < mm.length; i++) {
			System.out.printf("%2d月\n", mm[i]);
			cld(firstDay(y, mm[i]), lastDay(y, mm[i]));

			System.out.println();
			System.out.println();
		}
	}
}
