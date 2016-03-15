package week03;

public class BankAccount {
	private int currentBalance;
	private int amountToday;
	private Calendar lastTransaction;
	
	private final int WITHDRAWAL_LIMIT;
	
	public BankAccount() {
		this.currentBalance = 0;
		amountToday = 0;
		WITHDRAWAL_LIMIT = 800;
	}
	
	/**
	 * @precondition amount will always be positive
	 * @postcondition balance will always be >=0
	 * @postcondition balance will decrease by amount if under withdrawal limit and account balance
	 * @param amount
	 * @throws Exception
	 */
	public void withdraw(int amount) {
		if (amountToday + amount > WITHDRAWAL_LIMIT) {
			throw new Exception("Amount exceeds daily limit");
		} else if (amount > accountBalance) {
			throw new Exception("Amount > Balance");
		}
		currentBalance = currentBalance - amount;
		amountToday += amount;
	}
	
	public int getCurrentBalance() {
		return this.currentBalance;
	}
	
	public void deposit(int amount) {
		this.currentBalance += amount;
	}
	
	public int withdrawal(int amount) {
		if (this.currentBalance - amount >= 0) {
			this.currentBalance -= amount;
			return amount;
		} else {
			return -1;
		}
	}
}
