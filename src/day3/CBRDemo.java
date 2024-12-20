package day3;

public class CBRDemo {

	public static void main(String[] args) {
		Student s1=new Student("Virat",18,78.5);
		
		System.out.println(s1.getRno());  //18
		test(s1);
		System.out.println(s1.getRno());  //45

	}

	private static void test(Student z1) {
		System.out.println(z1.getRno());  //18
		z1.setRno(45);
		System.out.println(z1.getRno());  //45
	}

}
