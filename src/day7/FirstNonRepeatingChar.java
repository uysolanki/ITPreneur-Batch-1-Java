package day7;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str="abcdabbcecabb";
		Map<Character,Integer> count=new HashMap();
		for(char c:str.toCharArray())
		{
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			else
			{
				count.put(c,1);
			}
		}
		
		System.out.println(count);
		
		for(char c:str.toCharArray())
		{
			if(count.get(c)==1)
			{
				System.out.println("Answer " +c);
				break;
			}
		}

	}

}
