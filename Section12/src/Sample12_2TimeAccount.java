package sample;

public class Sample12_2TimeAccount extends Sample12_2Account{

	private long timeBalance;

	public Sample12_2TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}

	//--- ゲッタ ---//
	public long getTimeBalance() {
		return timeBalance;
	}

	//--- 定期預金を解約して全額を普通預金に移す ---//
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}

	//--- どちらの預金残高が多いか ---//
	static int compBalance(Sample12_2Account a, Sample12_2Account b) {
		if(a.getBalance() > b.getBalance())
			return 1;
		else if(a.getBalance() < b.getBalance())
			return -1;
		return 0;
	}

}
