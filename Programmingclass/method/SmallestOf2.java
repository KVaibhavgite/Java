/*Design a method which return the return of 2 no.*/
class SmallestOf2
{
public static int smallestOfTwo(int num1,int num2)
{
 if(num1<num2)
	{
  return num1;
	}
   else
	{
   return num2;
	}
}
public static void main(String[]args)
{
int n1=15,n2=56;
int smallest=smallestOfTwo(n1,n2);
System.out.println(smallest+" is smallest");
}
}
