class PrimeUsingMethod
{
public static void main(String[]args)
{
	int num=100;
int flag=1;
for(int i=2;i<=num;i++)
{
if(num%i==0)
{
flag=2;
break;
}
}
if(flag==1)
{
System.out.println("number is prime");
}
else
	{
		System.out.println("number is not prime");
	}
}
}
