package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTwoNumberInArray {

	public static void main(String[] args) {
		//int arr[]= {10,20,50,80,100};
		int sum=70;
		List<Integer> arr1=new ArrayList(Arrays.asList(10,20,50,80,100));
		//System.out.println(arr1);
		int flag=0;
		for(int num1:arr1)
		{
			int num2=sum-num1;
			if(arr1.contains(num2))
			{
				System.out.println("["+num1+","+num2+"]");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("No Pair Found");

	}

}

