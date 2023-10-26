
public class BankAccountExceptionTest2 {
	public static void main(String[] args) throws BankAccountException {
		BankAccount account = new BankAccount();
		
		account.withdraw(-8);
	}
}
