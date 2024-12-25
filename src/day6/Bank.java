package day6;

public class Bank {

	private double balance;

	public Bank() {}
	public Bank(double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public synchronized void deposit(double dAmt)
	{
		this.balance+=dAmt;
		System.out.println("Deposit Successful , Balance"+this.balance);
		notify();
	}
	
	public synchronized void withdraw(double wAmt)
	{
		if(this.balance<wAmt)
		System.out.println("Insufficient Balance");
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.balance-=wAmt;
		System.out.println("Withdraw Success , Balance"+ this.balance);
	}
}
