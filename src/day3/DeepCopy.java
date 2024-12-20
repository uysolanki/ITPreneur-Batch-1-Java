package day3;

public class DeepCopy {

	public static void main(String[] args) {
		Student s1=new Student("Virat",18,78.5);
		Student s2=new Student(s1);
		
		s2.setSname("Alice");
		System.out.println(s1.getSname());		//output

	}

}
