package day6;

public class CollegeFriendDriver {

	public static void main(String[] args) throws InterruptedException {
		Soak t1=new Soak();    //B
		Wash t2=new Wash();    //A
		
		
		t1.start();
		t1.join(3000,100);
		t2.start();		
	}

}


//join()
//join(int ms)
//join(int ms,int ns)