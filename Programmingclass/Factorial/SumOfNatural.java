/*Design a method which can accept a no.and return the sum of natural no.upto that no.*/
class SumOfNatural
{
public static int sum(int n)
{
int sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+i;
}
return sum;
}
public static void main(String[]args)
{
int n=10;
System.out.println(sum(n));
}
}