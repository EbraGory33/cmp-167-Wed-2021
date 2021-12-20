import java.util.Scanner;

public class SavingAccount extends BankAccount{
	public static Scanner input = new Scanner(System.in);
	static double LimitofWithdrawal;
	public int withdrawCounter = 1;
	private double interest = 0.0075;
	
	public static void main(String[] args) {
		
		SavingAccount acct = new SavingAccount();
		System.out.println("Enter amount of money you want to deposit into your savings account");
		int AmountOfMoney= input.nextInt();
		LimitofWithdrawal= AmountOfMoney * 0.2;
		acct.deposit(AmountOfMoney);
		for(int i=0;i<5;i++) {
			if(LimitofWithdrawal==0.0) {
				System.out.println();
				System.out.print("You have reached the allowed withdrawal limit no more withdrawals can be made.");
				i=5;
			}else {
				System.out.println();
				System.out.println("Enter the amount of money you want to withdraw.");
				double amount= input.nextInt();
				acct.limit(amount);
			}
		}
	}
	
	public void limit(double amount) {
		if(amount>LimitofWithdrawal) {
			System.out.println("You have exceeded the allowed withdrawal limit");
		}else {
			withdraw(amount);
			LimitofWithdrawal-= amount;
		}
	}
	
	
	public void withdraw(double amount) {
		if(withdrawCounter < 4) {
			super .withdraw(amount);
			withdrawCounter++;
		}else {
			double chargedInterest = amount*interest;
			System.out.println("Interest to be charged $"+chargedInterest);
			amount = amount - chargedInterest;
			super.withdraw(amount);
			withdrawCounter=1;
		}
	}

	
}
