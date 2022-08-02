/*WAJP to check wheather a number is strong number or not*/
class StrongNumber
{
public static void main(String[]args)
{
	int num=144;
	int fact=0;
int sum=0;
int n=num;
while(n!=0)
	{
fact=1;
int a=n%10;
for(int i=a;i>=1;i--)
{
fact=fact*i;
sum=sum+fact;
n=n/10;
}
}
if(sum==num)
	{
	System.out.print("true");
	}
	else
		{
		System.out.print("true");
	}
}
}
