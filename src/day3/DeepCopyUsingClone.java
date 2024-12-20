package day3;

public class DeepCopyUsingClone {
public static void main(String[] args) throws CloneNotSupportedException {
	Student s1=new Student("ViratKohli",18,78.5);
	Student s2=(Student)s1.clone();
	
	s2.setSname("Alice");
	System.out.println(s1.getSname());	
}
}
