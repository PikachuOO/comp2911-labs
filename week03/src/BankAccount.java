import java.util.Calendar;
import java.util.GregorianCalendar;

public class BankAccount {
	private int currentBalance;
	private int dailyLimit;	// daily limit
	private Calendar lastTransaction;
	
	private final int WITHDRAWAL_LIMIT = 800;
	
	public BankAccount(int startingBalance) {
		this.currentBalance = startingBalance;
//		this.dailyLimit = WITHDRAWAL_LIMIT;
		this.dailyLimit = 0;
		this.lastTransaction = new GregorianCalendar();
	}
	
//	public BankAccount(int startingBalance, int dailyLimit) {
//		this.currentBalance = startingBalance;
//		this.dailyLimit = dailyLimit;
//		this.lastTransaction = new GregorianCalendar();
//		
////		this.amountToday = 0;
////		WITHDRAWAL_LIMIT = 800;
//	}
	
	/**
	 * @precondition amount will always be positive (amount >= 0)
	 * @postcondition balance will always be >=0
	 * @postcondition balance will decrease by amount if under withdrawal limit and account balance
	 * @param amount
	 * @throws Exception
	 */
	public void withdraw(int withdrawalAmount) throws Exception {
//		if (amountToday + withdrawalAmount > WITHDRAWAL_LIMIT) {
		System.out.println("dailyLimit: " + dailyLimit + "");
//		if (dailyLimit - withdrawalAmount < 0) {
		
		// if new day, reset limit
		GregorianCalendar today = new GregorianCalendar();
		System.out.println("today.get(Calendar.YEAR): " + today.get(Calendar.YEAR));
		System.out.println("today.get(Calendar.DAY_OF_YEAR): " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("lastTransaction.before(today): " + lastTransaction.before(today));
		System.out.println("lastTransaction.equals(today): " + lastTransaction.equals(today));
		System.out.println("lastTransaction.after(today): " + lastTransaction.after(today));
		System.out.println();
		System.out.println("today.before(lastTransaction): " + today.before(lastTransaction));
		System.out.println("today.equals(lastTransaction): " + today.equals(lastTransaction));
		System.out.println("today.after(lastTransaction): " + today.after(lastTransaction));
		System.out.println();
		
		if (today.get(Calendar.YEAR) == lastTransaction.get(Calendar.YEAR) &&
			today.get(Calendar.DAY_OF_YEAR) > lastTransaction.get(Calendar.DAY_OF_YEAR)) {
			dailyLimit = 0;
		} else if (today.get(Calendar.YEAR) != lastTransaction.get(Calendar.YEAR)) {
			dailyLimit = 0;
		} else {
			System.out.println("daily limit not reset");
		}
		
		if (lastTransaction.after(today)) {
			dailyLimit = 0;
		} // else {
//			System.out.println("last transaction was today");
//		}
		
		if (dailyLimit + withdrawalAmount > WITHDRAWAL_LIMIT) {
			throw new Exception("Amount exceeds daily limit");
		} else if (withdrawalAmount > currentBalance) {
			throw new Exception("Amount > Balance");
		}
		
		currentBalance = currentBalance - withdrawalAmount;
		dailyLimit += withdrawalAmount;
		this.lastTransaction = today;
	}
	
	public int getCurrentBalance() {
		return this.currentBalance;
	}
	
	/**
	 * @precondition amount >= 0
	 * @postcondition new balance will increase by amount
	 * @param amount
	 */
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
