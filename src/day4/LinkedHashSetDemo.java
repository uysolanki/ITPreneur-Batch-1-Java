package day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> names=new LinkedHashSet();
		System.out.println(names.add("Alice")); //adding success : yes true
		System.out.println(names.add("Ben"));//true
		System.out.println(names.add("Chris"));//true
		System.out.println(names.add("David"));//true
		System.out.println(names.add(null));//true
		System.out.println(names.add("Chris"));//false
		
		
		System.out.println(names);

	}

}
