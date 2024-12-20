package day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
		
				int arr[]=new int[2];	
				Scanner sc=new Scanner(System.in);							//0			1
				try															//10		5						
				{
				System.out.println("Enter Number for index 0");  //10
				arr[0]=sc.nextInt();
				
				System.out.println("Enter Number for index 1");  //0
				arr[1]=sc.nextInt();
				
				
							try
							{
				
								System.out.println("Enter index for numerator");	//0
								int nIndex=sc.nextInt();			//nIndex=7
								int numerator=arr[nIndex];			//numerator=10
								
								System.out.println("Enter index for denominator");  //1
								int dIndex=sc.nextInt();			//dIndex=1
								int denomintor=arr[dIndex];			//denominator=5
								
								double result=numerator/denomintor;  //  10/5
								System.out.println(result);          //2
							}
							catch(ArithmeticException e1)
							{
								System.out.println("Denominator cannot be zero");
							}
							catch (ArrayIndexOutOfBoundsException e2) {
								System.out.println("Please enter valid index");
							}
								
				
				}
				catch(InputMismatchException e1)
				{
					System.out.println("Please enter valid integer value only");
				}

	}

}
