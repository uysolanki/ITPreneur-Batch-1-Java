package day4;

import java.util.Scanner;

public class Student implements Comparable<Student>
{

	private int rno;
	private String sname;
	private int age;
	private double per;
	
	public Student() {}
	
	
	public Student(int rno, String sname, int age, double per) {
		this.rno = rno;
		this.sname = sname;
		this.age = age;
		this.per = per;
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
	
	
	
		public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getPer() {
		return per;
	}


	public void setPer(double per) {
		this.per = per;
	}


	
		@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", age=" + age + ", per=" + per + "]";
	}


	
// rno in Ascending Order
//		@Override
//	public int compareTo(Student s) {
//		if(this.rno>s.rno)
//			return 1;
//		else if(this.rno<s.rno)
//			return -1;
//		else
//			return 0;
//	}
		//Ages in Ascending Order
//		@Override
//	public int compareTo(Student s) {
//		if(this.age>s.age)
//			return 1;
//		else if(this.age<s.age)
//			return -1;
//		else
//			return 0;
//	}
		
//		//Ages in Descending Order	
//		@Override
//	public int compareTo(Student s) {
//		if(this.age>s.age)
//			return -1;
//		else if(this.age<s.age)
//			return 1;
//		else
//			return 0;
//	}
		
//		//Name in Ascending Order	
//		@Override
//		public int compareTo(Student s) {
//			return this.sname.compareTo(s.sname);
//		}
		
//		//Name in Descending Order	
//				@Override
//				public int compareTo(Student s) {
//					return -this.sname.compareTo(s.sname);
//				}
		
		//per in Descending Order
		@Override
		public int compareTo(Student o) {
				if(this.per>o.per)
						return -1;
				else if(this.per<o.per)
					return 1;
				else 
					return 0;
				
		}

}
