/*Design a method which can accept an array and return the count of even number in that array.*/
class  PrintCountOfEvenNumber
{
	public static void main(String[] args) 
	{
		int []a={10,11,12,44,22,7,9,66};
		{
			int count=0;
		for(int i=0;i<a.length;i++)
           {
           if(evenNumberCount(a[i]))
              {
              count++;
                }
            }
                    System.out.println(count);
		}
		}
         public static boolean evenNumberCount( int num)
      	 {
		  for(int i=0;i<num;i++)
            {
            if(num%2==0)
             return true;
                }
           return false;
	}
}
