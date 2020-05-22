
public class Sample9_4Day {
	private int year  = 1; //年
	private int month = 1;
	private int date  = 1;

	//-- コンストラクタ --//
	public Sample9_4Day() {}
	public Sample9_4Day(int year) {this.year = year;}
	public Sample9_4Day(int year, int month) {this(year); this.month = month;}
	public Sample9_4Day(int year, int month, int date) {this(year, month); this.date = date;}
	public Sample9_4Day(Sample9_4Day d) {this(d.year, d.month, d.date);}

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
	public boolean equalTo(Sample9_4Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//--- 文字列表現を返却 ---//
	public String toString() {
		String[] wd = {"日" ,"月" , "火" , "水" , "木" , "金" , "土"};
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}
