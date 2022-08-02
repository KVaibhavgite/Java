/*Design a method which accept a number and returns 1 if the number is prime,
else return  the lowest factor greater than 1.*/
class prime11
{
public static int isprime(int num)
{
int sum=0;
int flag=1;
for(int i=2;i<num;i++)
{
int digit=num%10;
if(digit%i==0)
{
sum=sum+digit;
num=num/10;
if(num%i!=0)
{
flag=123;
if(i>1)
return i;
}
}
}
}
}
public static void main(String ...args)
	{
        int num1=9,num2=7,num3=8;
		System.out.println(isprime(num1));
		System.out.println(isprime(num2));
		System.out.println(isprime(num3));
	}
}