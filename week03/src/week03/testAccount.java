package week03;

public class testAccount {
	public static void main(String args[]) {
		BankAccount ba = new BankAccount();
		System.out.println(ba.getCurrentBalance());
		
		ba.deposit(100);
		System.out.println(ba.getCurrentBalance());
		
		if (ba.withdrawal(300) == 300) {
			System.out.println("withdraw success! $" + ba.getCurrentBalance());
		}
		
		if (ba.withdrawal(500) == 500) {
			System.out.println("withdraw success! $" + ba.getCurrentBalance());
		} else {
			System.out.println("not enough funds to withdraw $500");
		}
	}
}
