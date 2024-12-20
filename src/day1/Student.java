package day1;

import java.util.Scanner;

public class Student {

	private String sname;
	private int rno;
	private double per;
	
	public void acceptStudent()					//	batch[0]    batch[1]    batch[2]
	{
		Scanner sc=new Scanner(System.in);		//   	s1      	s2  
		
		System.out.println("Enter Student name");  		//Virat  	Rohit   Rishab
		sname=sc.next();
		
		System.out.println("Enter Student rno");		//18  		45      17
		rno=sc.nextInt();
		
		System.out.println("Enter Student percentage"); //78.5  	88.5    98.5
		per=sc.nextDouble();
	}
	
	public void displayStudent()
	{
		System.out.println("Student Name is "+sname);
		System.out.println("Student Roll Number is "+rno);
		System.out.println("Student Percentage is "+per);
	}

	public void search(int n) {
		if(rno==n)
			System.out.println("Found");
	}
}
