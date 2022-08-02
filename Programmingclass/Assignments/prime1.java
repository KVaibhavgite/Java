/*Design a method which accept a number and returns 1 if the number is prime,
else return  the lowest factor greater than 1.*/
class prime1
{
public static int isprime(int num)
{
int flag=1;
for(int i=2;i<num;i++)
{
if(num%i==0)
{
flag=123;
if(i>1)
return i;
}
}
return 1;
}
public static void main(String ...args)
	{
        int num1=9,num2=7,num3=8;
		System.out.println(isprime(num1));
		System.out.println(isprime(num2));
		System.out.println(isprime(num3));
	}
}