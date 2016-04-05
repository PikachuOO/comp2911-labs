import static org.junit.Assert.*;
import org.junit.Test;

public class testAccount {
	public static void main(String args[]) {
//		BankAccount ba = new BankAccount();
//		System.out.println(ba.getCurrentBalance());
//		
//		ba.deposit(100);
//		System.out.println(ba.getCurrentBalance());
//		
//		if (ba.withdrawal(300) == 300) {
//			System.out.println("withdraw success! $" + ba.getCurrentBalance());
//		}
//		
//		if (ba.withdrawal(500) == 500) {
//			System.out.println("withdraw success! $" + ba.getCurrentBalance());
//		} else {
//			System.out.println("not enough funds to withdraw $500");
//		}
		
		BankAccount one = new BankAccount(500);
//		BankAccount two = new BankAccount(501, 700);
		
		System.out.println(one.getCurrentBalance());
//		System.out.println(two.getCurrentBalance());
		
		one.deposit(200);
		
		System.out.println(one.getCurrentBalance());
		
		try {
			one.withdraw(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(one.getCurrentBalance());
	}
}