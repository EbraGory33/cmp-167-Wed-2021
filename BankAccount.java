
public class BankAccount {
	public int number;
	private double balance;
	private static int accountNumbers;
	
	public BankAccount() {
		number = ++accountNumbers;
	}
	
	public void deposit(double amount) {
		if(amount >= 0.0) {
			balance +=amount;
			System.out.println(amount + " has been deposited to account "+ number + "\nYou have a balance of $" 
			+balance);
		}else {
			System.out.println("Unsuccessful transaction,invalid amount");
		}
	}
	
	public void withdraw(double amount) {
		if((balance-amount)>=0.0) {
			balance -= amount;
			System.out.println("$"+amount+" has been withdrawn from account "+number+"\nYou have a new balance of $"+balance);
		}else {
			System.out.println("Unsuccesful transaction, insufficient balance");
		}
	}
	@Override
	public String toString() {
		return "Account #" + number+", balance: $"+ balance;
	}
}
