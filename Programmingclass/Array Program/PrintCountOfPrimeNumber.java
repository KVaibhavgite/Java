/*Design a method which can accept an array and return the count of prime number in that array.*/
class PrintcountOfPrimeNumber
{
public static void main(String[]args)
{
	int count=1;
int [] a={11,16,23,14,7,12,8,10};
for(int i=0;i<a.length;i++)
{
if(isprime(a[i]))
{
count++;
}
}
System.out.println(count);
}
public static boolean isprime(int num)
{
for(int i=2;i<num;i++)
{
if(num%i==0)
return false;
}
return true;
}
}

