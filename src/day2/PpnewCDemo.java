package day2;

import java.util.LinkedList;
import java.util.List;

public class PpnewCDemo {

	public static void main(String[] args) {
		Amitabh a1=new Abhishek();
		//a1.home();
		System.out.println(a1.qualification);
		
		//a1.car()  //not permissable , reason as method is not present in parent
		
		LinkedList<String> l1=new LinkedList();
		l1.add("ALice");
		l1.addFirst("Ben");
		
		System.out.println("");
		
	}

}


// hence proved method belongs to the refernce

/*class			
data   --->  	ref
method --->     object
*/