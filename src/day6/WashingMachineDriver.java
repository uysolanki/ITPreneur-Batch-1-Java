package day6;

public class WashingMachineDriver {

	public static void main(String[] args) throws InterruptedException {
		Soak t1=new Soak();
		Wash t2=new Wash();
		Dry t3=new Dry();
		
		t1.start();
		t1.join();
		t2.start();		
		t2.join();
		t3.start();

	}

}
