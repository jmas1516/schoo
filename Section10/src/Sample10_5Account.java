//銀行口座クラス
public class Sample10_5Account {
	private static int counter = 0; //何番までの識別番号を与えたか
	private String name;            //口座名義
	private String no;              //口座番号
	private int balance;            //預金残高
	private int id;                 //識別番号
	{
		System.out.println("解明銀行での口座開設ありがとうございます。");
	}
	//--- コンストラクタ ---//
	Sample10_5Account(String name, String no, int balance){
		this.name    = name;
		this.no      = no;
		this.balance = balance;
		this.id      = ++counter;
	}

	//--- ゲッタ ---//
	public String getName()  {return name;}
	public String getNo()    {return no;}
	public int getBalance()  {return balance;}
	public int getId()       {return id;}

	//--- k円預ける ---//
	public void deposit(int k) {
		balance += k;
	}

	//--- k円おろす ---//
	public void withdraw(int k) {
		balance -= k;
	}
}