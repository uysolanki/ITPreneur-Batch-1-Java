package day3;

import java.util.Scanner;

public class Student extends Person implements Cloneable
{

	private String sname;
	private int rno;
	private double per;
	
	public Student() {}
	public Student(String sname, int rno, double per) {
		this.sname = sname;
		this.rno = rno;
		this.per = per;
	}
	
	public Student(Student temp) {
		this.sname = temp.sname;
		this.rno = temp.rno;
		this.per = temp.per;
	}

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
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
