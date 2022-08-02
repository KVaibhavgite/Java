/*Design a method which accept 2number and count its the Even number between 
those 2numbers using recursion call*/
class R
{
static int count=0; 
public static int printEvenNumber(int m,int n)
{
if(m<n)
	{
	printEvenNumber(m,n-1);
	if(n%2==0)
      {
		count++;
	  }
	}	
	return count;
}
public static void main(String[]args)
{
	 printEvenNumber(1,10);
	System.out.println(count);
}
}
