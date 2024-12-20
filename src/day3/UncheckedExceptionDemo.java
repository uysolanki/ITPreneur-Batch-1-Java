package day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter numerator");
		int n=sc.nextInt();
		
		System.out.println("Enter denominator");
		int d=sc.nextInt();
		
		int result=n/d;
		
		System.out.println(result);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Please enter valid denominator");
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Please enter valid integer value");
		}

	}

}
