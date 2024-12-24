package day4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemoProMax {

	public static void main(String[] args) {
		Set<NewStudent> acadmicNewStudents=new TreeSet(new StudentPerComparator());
		acadmicNewStudents.add(new NewStudent(101,"Alice",15,78.5)); //adding success : yes true
		acadmicNewStudents.add(new NewStudent(103,"Virat",18,88.5));//true
		acadmicNewStudents.add(new NewStudent(104,"Hardik",14, 98.5));//true
		acadmicNewStudents.add(new NewStudent(102,"Suryakumar",16, 68.5));//true
		acadmicNewStudents.add(new NewStudent(106,"Rohit",13, 58.5));//true
		acadmicNewStudents.add(new NewStudent(107,"Rahul",21, 67.5));//true
		acadmicNewStudents.add(new NewStudent(105,"Ben",20, 93.5));//true		
		
		System.out.println("-----Academic NewStudents-----"); //Desc order of Per
		for(NewStudent s:acadmicNewStudents)
		 System.out.println(s);
		
		
		Set<NewStudent> sportsNewStudents=new TreeSet(new StudentAgeComparator());
		sportsNewStudents.add(new NewStudent(101,"Alice",15,78.5)); //adding success : yes true
		sportsNewStudents.add(new NewStudent(103,"Virat",18,88.5));//true
		sportsNewStudents.add(new NewStudent(104,"Hardik",14, 98.5));//true
		sportsNewStudents.add(new NewStudent(102,"Suryakumar",16, 68.5));//true
		sportsNewStudents.add(new NewStudent(106,"Rohit",13, 58.5));//true
		sportsNewStudents.add(new NewStudent(107,"Rahul",21, 67.5));//true
		sportsNewStudents.add(new NewStudent(105,"Ben",20, 93.5));//true		
		
		System.out.println("-----Sports NewStudents-----");  //Asc order of Age
		for(NewStudent s:sportsNewStudents)
		 System.out.println(s);
		
		Set<NewStudent> examNewStudents=new TreeSet(new StudentNameComparator());
		examNewStudents.add(new NewStudent(101,"Alice",15,78.5)); //adding success : yes true
		examNewStudents.add(new NewStudent(103,"Virat",18,88.5));//true
		examNewStudents.add(new NewStudent(104,"Hardik",14, 98.5));//true
		examNewStudents.add(new NewStudent(102,"Suryakumar",16, 68.5));//true
		examNewStudents.add(new NewStudent(106,"Rohit",13, 58.5));//true
		examNewStudents.add(new NewStudent(107,"Rahul",21, 67.5));//true
		examNewStudents.add(new NewStudent(105,"Ben",20, 93.5));//true		
		
		System.out.println("-----Exam NewStudents-----");  //Asc order of Age
		for(NewStudent s:examNewStudents)
		 System.out.println(s);
	}

}
