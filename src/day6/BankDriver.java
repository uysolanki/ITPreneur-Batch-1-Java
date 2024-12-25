package day6;

public class BankDriver {

	public static void main(String[] args) {
		Bank bank=new Bank(5000);
		System.out.println(bank.getBalance());

		Son t1=new Son(bank);
		Father t2=new Father(bank);
		
		t1.start();
		t2.start();
		
		
	}

}
