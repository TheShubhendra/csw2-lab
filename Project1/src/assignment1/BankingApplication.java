package assignment1;

abstract class Account{
	private int number;
	private float balance;
	
	
	
	public Account(int number, float balance) {
		this.number = number;
		this.balance = balance;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	abstract public void withdrawl(int amount);
	
	abstract public void deposit(int amount);
}


class SavingsAccount extends Account{


	private float interestRate;
	
	

	public SavingsAccount(int number, float balance, float interestRate) {
		super(number, balance);
		this.interestRate = interestRate;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void withdrawl(int amount) {
		if(super.getBalance()<amount) {
			System.out.println("Isufficient Balance");
		}else {
			super.setBalance(super.getBalance()-amount);
		}
		
	}

	@Override
	public void deposit(int amount) {
		super.setBalance(super.getBalance() + amount);
		float interest = super.getBalance() * this.interestRate/ 100;
		System.out.println("Interest: "+ interest);
		
	}
	
	
}


class CurrentAccount extends Account{
	private float overdraftLimit;

	
	
	

	public CurrentAccount(int number, float balance, float overdraftLimit) {
		super(number, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public float getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(float overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdrawl(int amount) {
		if(amount>super.getBalance() + this.overdraftLimit) {
			System.out.println("Withdrawal amount exceeds the overdraft limit");
		}
		super.setBalance(super.getBalance() - amount);
	}

	@Override
	public void deposit(int amount) {
		super.setBalance(super.getBalance()+amount);
		
	}
	
}

public class BankingApplication {

	public static void main(String[] args) {
		Account sb = new SavingsAccount(12312, 31232.32f, 2.9f);
		Account curr = new CurrentAccount(33232, 32132.43f, 100000);
		sb.withdrawl(5000000);
		curr.deposit(20);
	
		
		

	}

}
