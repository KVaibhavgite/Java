/*WAJP to find out the largest element of an array and return the Largest element of an array.
int [] a={6,2,3,4,7,8,11}
o/p=11
*/
class Largest1
{
public static void main(String[]args)
{
int []a={6,2,3,4,7,8,11};
System.out.println(printLargest(a));
}
public static int printLargest(int []a)
{
int largest=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]>largest)
	{
		largest=a[i];
	}
	}
return largest;
}
}

