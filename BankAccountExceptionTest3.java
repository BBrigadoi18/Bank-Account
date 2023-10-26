
public class BankAccountExceptionTest3 {
	public static void main(String[] args) throws BankAccountException {
		BankAccount account = new BankAccount();
		
		account.deposit(100);
		account.withdraw(101);
	}
}
