package Sample;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class Sample12_1Day {
	private static int y;
	private static int m;
	private static int d;
	//(Sample10_4)
	static {
		GregorianCalendar today = new GregorianCalendar();
		y  = today.get(YEAR);
		m = today.get(MONTH) + 1;
		d  = today.get(DATE);
	}

	private int year  = y; //年
	private int month = m;
	private int date  = d;

	//--- y年は閏年か？ ---//
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}

	//--- 2つの日付の前後関係(Sample10_4) ---//
	public static String relation(Sample12_1Day d1, Sample12_1Day d2) {
		if(d1.year == d2.year && d1.month == d2.month && d1.date == d2.date) return "a = b";
		if(d1.year > d2.year || d1.month > d2.month || d1.date > d2.date)    return "a > b";
		return "a < b";
	}

	//-- コンストラクタ --//
	public Sample12_1Day() {}
	public Sample12_1Day(int year) {
		this.year = year;
		}
	public Sample12_1Day(int year, int month) {
		this(year);
		if(month <= 0) this.month = 1;
		else if(month >= 13) this.month = 12;
		else this.month = month;
		}
	public Sample12_1Day(int year, int month, int date) {
		this(year, month);
		if(date <= 0) this.date = 1;
		else if(month == 4 || month == 6 || month == 9 || month == 11 && date >= 31) this.date = 30;
		else if(isLeap(y) && month == 2 && date >= 30) this.date = 29;
		else if(month == 2 && date >= 29) this.date = 28;
		else if(date >= 32) this.date = 31;
		else this.date = date;
		}
	public Sample12_1Day(Sample12_1Day d) {this(d.year, d.month, d.date);}

	//--- 年・月・日を取得 ---//
	public int getYear() {return year;}
	public int getMonth() { return month;}
	public int getDate() {return date;}

	//--- 年・月・日を設定 ---//
	public void setYear(int year)   {this.year = year;}
	public void setMonth(int month) {this.month = month;}
	public void setDate(int date)   {this.date = date;}

	public void set(int year, int month, int date) {
		this.year  = year;
		this.month = month;
		this.date  = date;
	}

	//--- 曜日を求める ---//
	public boolean isLeap() {return isLeap(year);}

	//--- 曜日を決める ---//
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if(m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return(y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//--- 日付dと正しいか ---//
	public boolean equalTo(Sample12_1Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//--- 年内での経過日数(Sample10_4) ---//
	public int pass() {
		int passDay = 0;
		for(int i = 1; i < month; i++) {
			if(i == 4 || i == 6 || i == 9 || i == 11) passDay += 30;
			else if(i == 2) passDay += (isLeap(year) ? 29 : 28);
			else passDay += 31;
		}
		passDay += date;
		return passDay;
	}

	//--- 残りの日数(Sample10_4) ---//
	public int rem() {
		int remDay = (isLeap(year) ? 366 : 365);
		remDay -= pass();
		return remDay;
	}

	//--- 他の日付との前後関係(Sample10_4) ---//
	public String relation(Sample12_1Day d) {
		if(equalTo(d)) return "と同じ日付";
		else if(year > d.year || month > d.month || date > d.date) return "より後の日";
		else return "より前の日";
	}

	//--- 文字列表現を返却 ---//
	public String toString() {
		String[] wd = {"日" ,"月" , "火" , "水" , "木" , "金" , "土"};
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}
