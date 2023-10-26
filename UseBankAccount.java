
public class UseBankAccount {
	public static void main(String[] args) throws BankAccountException {
		BankAccount account = new BankAccount();
		
		account.deposit(100);
		System.out.println(account.toString());
		
		account.deposit(40);
		account.withdraw(20);
		System.out.println(account.toString());
		
	}
}
