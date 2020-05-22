//銀行口座クラス
public class Sample9_3Account {
	private String name;  //口座名義
	private String no;    //口座番号
	private int balance; //預金残高

	private Sample9_3Day day;

	//--- コンストラクタ ---//
	Sample9_3Account(String name, String no, int balance, Sample9_3Day day){
		this.name    = name;
		this.no      = no;
		this.balance = balance;

		this.day = new Sample9_3Day(day);
	}

	//--- ゲッタ ---//
	public String getName()  {return name;}
	public String getNo()    {return no;}
	public int getBalance()  {return balance;}

	public Sample9_3Day getDay() {return new Sample9_3Day(day);}

	//--- k円預ける ---//
	public void deposit(int k) {
		balance += k;
	}

	//--- k円おろす ---//
	public void withdraw(int k) {
		balance -= k;
	}

	//--- toString ---//
	public String toString() {
		return String.format("口座名義　：%s\n口座番号　；%s\n口座開設日：" + day +"\n預金口座　：%d", name, no, balance);
	}
}
