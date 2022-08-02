/*Design a method which can accept an array and a key element and return the index of an key element if 
is present else it should return-1.
*/
class ReturnIndex
{
public static void main(String[]args)
{
int []a={6,2,3,4,7,8};
System.out.println(returnIndex(a,8));
}
public static int returnIndex(int[]a, int n)
{
	int key=n;
	int i=0;
	int flag=1;
for(i=0;i<a.length;i++)
{
if(a[i]==key)
	{
	flag=12;
break;
	}
	}

if(flag==1)
	{
	return-1;
	}
	else
	{
return i;
}
}
}
