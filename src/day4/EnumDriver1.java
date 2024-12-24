package day4;

import java.util.Scanner;

public class EnumDriver1 {

	public static void main(String[] args) {
//		Weekday today=Weekday.MONDAY;
//		System.out.println("Today is "+today);
//		
//		Weekdays today1=new Weekdays("Apple");
//		System.out.println("Today is "+today1.getWeekday());
//
//		Direction direction=Direction.NORTH;
//		System.out.println(direction);
//		
//		Planet p1=Planet.MARS;
//		System.out.println("Mass of Planet " + p1 + " is "+p1.getMass());
//		System.out.println("Radius of Planet " + p1 + " is "+p1.getDiameter());
//		System.out.println("Gravity of " + p1 + " is "+p1.calculateGravity());
//		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Id");
		String userId=sc.next();
		System.out.println("Enter User password");
		String userPw=sc.next();
		
		//username cannot be blank
		//password must be minimum 8 chars
		MyAppErrors error;
		if(userId.length()<3)
		{
			error=MyAppErrors.ERROR1;
			System.out.println(String.format(error.getErrorMessage(),userId));
		}
		
		if(userPw.length()<8)
		{
			error=MyAppErrors.ERROR2;
			System.out.println(String.format(error.getErrorMessage(),userPw));
		}
		
		
	}

}
