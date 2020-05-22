package sample;

//銀行口座クラス
public class Sample12_2Account {
	private static int counter = 0; //何番までの識別番号を与えたか
	private String name;            //口座名義
	private String no;              //口座番号
	private long balance;            //預金残高
	private int id;                 //識別番号
	{
		System.out.println("解明銀行での口座開設ありがとうございます。");
	}
	//--- コンストラクタ ---//
	Sample12_2Account(String name, String no, long balance){
		this.name    = name;
		this.no      = no;
		this.balance = balance;
		this.id      = ++counter;
	}

	//--- ゲッタ ---//
	public String getName()  {return name;}
	public String getNo()    {return no;}
	public long getBalance()  {return balance;}
	public int getId()       {return id;}

	//--- セッタ ---//
	public void setBalance(long balance) { this.balance = balance;}


	//--- k円預ける ---//
	public void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	public void withdraw(long k) {
		balance -= k;
	}
}