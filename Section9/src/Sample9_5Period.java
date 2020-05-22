//期間
public class Sample9_5Period {
	private Sample9_5Day from;
	private Sample9_5Day to;

	Sample9_5Period(Sample9_5Day from, Sample9_5Day to){
		this.from = new Sample9_5Day(from);
		this.to   = new Sample9_5Day(to);
	}

	public String toString() {
		return ("開始日：" + from + " 期限：" + to);
	}

}
