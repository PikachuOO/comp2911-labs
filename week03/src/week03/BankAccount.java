import java.util.Calendar;
import java.util.GregorianCalendar;

public class BankAccount {
	private int currentBalance;
	private int dailyLimit;	// daily limit
	private Calendar lastTransaction;
	
//	private final int WITHDRAWAL_LIMIT;
	
	public BankAccount(int startingBalance, int dailyLimit) {
		this.currentBalance = startingBalance;
		this.dailyLimit = dailyLimit;
		this.lastTransaction = new GregorianCalendar();
		
//		this.amountToday = 0;
//		WITHDRAWAL_LIMIT = 800;
	}
	
	/**
	 * @precondition amount will always be positive
	 * @postcondition balance will always be >=0
	 * @postcondition balance will decrease by amount if under withdrawal limit and account balance
	 * @param amount
	 * @throws Exception
	 */
	public void withdraw(int withdrawalAmount) {
//		if (amountToday + withdrawalAmount > WITHDRAWAL_LIMIT) {
		
		if (dailyLimit - withdrawalAmount < 0) {
			throw new Exception("Amount exceeds daily limit");
		} else if (withdrawalAmount > currentBalance) {
			throw new Exception("Amount > Balance");
		}
		
		currentBalance = currentBalance - withdrawalAmount;
		dailyLimit = dailyLimit - withdrawalAmount;
//		amountToday += amount;
	}
	
public int getCurrentBalance() {
	return this.currentBalance;
}
	
public void deposit(int amount) {
	this.currentBalance += amount;
}
	
//	public int withdrawal(int amount) {
//		if (this.currentBalance - amount >= 0) {
//			this.currentBalance -= amount;
//			return amount;
//		} else {
//			return -1;
//		}
//	}
}
