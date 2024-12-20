package day3;

public class ShallowCopy {

	public static void main(String[] args) {
		Student s1=new Student("Virat",18,78.5);
		Student z1=s1;  //shallow copy
		
		z1.setSname("Alice");
		System.out.println(s1.getSname());

	}

}
