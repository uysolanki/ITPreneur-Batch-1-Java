package day6;

public class Alpha extends Thread
{
@Override
public void run() {
	for(char i='a';i<='z';i++)
	{
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
}
}


//q1 can we override the start() : Yes
//q2 is it advisable to do so? : No

//q3 can we overload the run() : Yes
//q4 is it advisable to do so? : No
