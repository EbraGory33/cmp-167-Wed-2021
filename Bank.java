import java.util.ArrayList;

public class Bank {
	private String name;
	private String address;
	ArrayList<CheckingAccount> accounts  = new ArrayList<CheckingAccount>();
	ArrayList<BankAccount> otherAccounts = new ArrayList<BankAccount>();
	
	public Bank(String name,String Address) {
			this.name=name;
			this.address=address;
			System.out.println("A bank has been created");
	}
	
	public void openAccount(char type) {
		if (type=='c') {
			CheckingAccount acct = new CheckingAccount();
			accounts.add(acct);
			System.out.println("Checking account #"+acct.number+" Has been created");
		}else if (type =='s') {
			SavingAccount acct = new SavingAccount();
			otherAccounts.add(acct);
			System.out.println("Saving account #"+acct.number+" Has been created");
		}else {
			BankAccount acct = new BankAccount();
			otherAccounts.add(acct);
			System.out.println("Account"+acct.number+" Has been created");
		}
	}
	
	public void displayAll() {
		System.out.println("Checkin Accounts");
		for(CheckingAccount acct : accounts ) {
			System.out.println(acct);
		}
		System.out.println(" Rest of the accounts ");
		for(BankAccount acct : accounts ) {
			System.out.println(acct);
		}	
	}
	@Override
	public String toString() {
		return "Bank" +name + ", Address "+address + "Number of clients: "+ (accounts.size() +otherAccounts.size());
	}
}
