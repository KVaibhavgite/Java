/*WAJP to find out the smallest element of an array and return the smallest element of an array.
int [] a={6,2,3,4,7,8,11}
o/p=2
*/
class Smallest1
{
public static void main(String[]args)
{
int []a={6,2,3,4,7,8,11};
System.out.println(printSmallest(a));
}
public static int printSmallest(int []a)
{
int smallest=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]<smallest)
	{
		smallest=a[i];
	}
	}
return smallest;
}
}

