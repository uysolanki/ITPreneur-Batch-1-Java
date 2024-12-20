package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoWarningByCompiler {

	public static void main(String[] args) throws IOException
	{
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter numerator");
		
		int n=Integer.parseInt(br.readLine());
		
		System.out.println("Enter numerator");
		int d=Integer.parseInt(br.readLine());
		
		int result=n/d;
	}

}
