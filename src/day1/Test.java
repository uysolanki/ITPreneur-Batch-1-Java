package day1;

public class Test {

	public static void main(String[] args) {
	
//		int customerFlatPrice=4;
//		double newsPaperFlatPrice=customerFlatPrice;  //widening  will be done implicitly
//													 // bcoz there is no data loss
//		
//		System.out.println(customerFlatPrice);
//		System.out.println(newsPaperFlatPrice);
		
//		double customerShopPrice=8.75;
//		int newsPaperShopPrice=(int)customerShopPrice;
//		
//		System.out.println(customerShopPrice);		//narrowing has to be done explicitly
//		System.out.println(newsPaperShopPrice);		//bcoz there is data loss
		
		//operators
		//ternary iterator equivalent to if else
		
//		int a=100;
//		int b=100;
		
		//display max of 2 numbers
		
//		if(a>=b) //every condition is 2 output T F
//		{
//			System.out.println(a + " is maximum");  //100 is maximum
//		}
//		else
//		{
//			System.out.println(b + " is maximum");
//		}
		                   //T:F
//		int max=  a>=b  ?    a:b;
//		System.out.println(max + " is maximum");
		
		int a=87;
		int b=93;
		System.out.println(a>=b? a + " is maximum": b + " is maximum");
		
	}

}
