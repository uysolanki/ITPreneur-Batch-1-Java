package day6;

public class Number implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 26; i++)
			try {
				System.out.println(" " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e1) {}
	}
}
