/*Design a method which can accept an array and return the sum of array elements.*/
class  PrintSumOfNumber
{
	public static void main(String[] args) 
	{
		int []a={10,11,12,44,22,7,9,66};
		{
           System.out.println(sumOfNumber(a));
		}
	}
         public static int sumOfNumber( int [] num)
      	 {
	 int sum=0;
	     for(int i=0;i<num.length;i++)
            {
            sum=sum+num[i];
	}
	return sum;
	}
}
