
public class BankAccount {

	int totalAmount;
	
	public BankAccount() {
		totalAmount = 0;
	}
	
	public String toString() {
		return "You have $" + getTotal() + " in your bank account";
	}
	
	public int getTotal() {
		return totalAmount;
	}
	
	public void deposit(int amount) throws BankAccountException {
		if (amount < 0) {
			throw new BankAccountException("Invalid amount. Amount must be positive");
		}
		totalAmount += amount;
	}
	
	public void withdraw(int amount) throws BankAccountException {
		if (amount < 0) {
			throw new BankAccountException("Invalid amount. Amount must be positive");
		} else if (totalAmount - amount < 0) {
			throw new BankAccountException("Cannot withdraw. You do not have enough money in your account");
		}
		totalAmount = totalAmount - amount;
		
	}
	
}
