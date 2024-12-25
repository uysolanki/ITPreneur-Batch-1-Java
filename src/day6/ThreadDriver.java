package day6;

public class ThreadDriver {

	public static void main(String[] args) {
		
		
		Alpha thread2=new Alpha();
		thread2.start();
		
		Number thread1=new Number();
		Thread tx=new Thread(thread1);
		tx.start();
	}

}
