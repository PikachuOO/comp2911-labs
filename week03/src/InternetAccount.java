import java.util.Calendar;
import java.util.GregorianCalendar;

public class InternetAccount extends BankAccount {
	private int internetWithdrawalLimit;	// limit of 10 per month
	private Calendar lastWithdrawal;
	
	private final int WITHDRAWAL_LIMIT = 10;
	
	public InternetAccount(int startingBalance) {
		super(startingBalance);
		this.internetWithdrawalLimit = WITHDRAWAL_LIMIT;
		this.lastWithdrawal = new GregorianCalendar();
	}
	
	public InternetAccount(int startingBalance, int internetWithdrawalLimit) {
		super(startingBalance);
		this.internetWithdrawalLimit = internetWithdrawalLimit;
		this.lastWithdrawal = new GregorianCalendar();
	}
	
	@Override
	public void withdraw(int withdrawalAmount) throws Exception {
		if (internetWithdrawalLimit <= 0) {
			throw new Exception("Amount exceeds daily limit: 10 withdrawals per day for internet account");
		} else {
			super.withdraw(withdrawalAmount);
		}
	}
	
}
