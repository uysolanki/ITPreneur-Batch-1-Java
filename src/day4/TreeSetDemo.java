package day4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> names=new TreeSet();
		System.out.println(names.add("Alice")); //adding success : yes true
		System.out.println(names.add("Ben"));//true
		System.out.println(names.add("Elcid"));//true
		System.out.println(names.add("George"));//true
		System.out.println(names.add("Chris"));//true
		System.out.println(names.add("Frank"));//true
		System.out.println(names.add("David"));//true		
		//System.out.println(names.add(null));//true
		System.out.println(names);

	}

}
