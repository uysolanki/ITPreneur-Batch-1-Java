package day4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemoPro {

	public static void main(String[] args) {
		Set<Student> students=new TreeSet();
		 students.add(new Student(101,"Alice",15,78.5)); //adding success : yes true
		 students.add(new Student(103,"Virat",18,88.5));//true
		 students.add(new Student(104,"Hardik",14, 98.5));//true
		 students.add(new Student(102,"Suryakumar",16, 68.5));//true
		 students.add(new Student(106,"Rohit",13, 58.5));//true
		 students.add(new Student(107,"Rahul",21, 67.5));//true
		 students.add(new Student(105,"Ben",20, 93.5));//true		
		// names.add(null));//true
		for(Student s:students)
		 System.out.println(s);
	}

}
