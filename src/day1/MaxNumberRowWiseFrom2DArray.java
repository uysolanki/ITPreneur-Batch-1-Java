package day1;

public class MaxNumberRowWiseFrom2DArray {

	public static void main(String[] args) {
	
		int matrix[][]= {{19,13,6},{20,29,14},{6,15,8}};
		
		int max;
		
		for(int i=0;i<3;i++)
		{
			max=0;
			for(int j=0;j<3;j++)
			{
				if(matrix[i][j]>max)
				{
					max=matrix[i][j];
				}
			}
			//System.out.println("Maximum Number from row" + (i+1) + " is " +max);
			System.out.println(String.format("Maximum Number from row %d is %d",i+1,max));
		}
	}

}
