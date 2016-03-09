package week03;

public class BankAccount {
	private int currentBalance;
	
	public BankAccount() {
		this.currentBalance = 500;
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
