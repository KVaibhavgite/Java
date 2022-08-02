/*Design a method which accept a number and returns  the sum of non-prime.*/
class Nonprime
{
public static void main(String[]args)
{
int n=3456;
int i,j,c,sum=0;
int num=n;
for(i=0;i<n;i++)
{
for(i=2;i<nu;i++)
{
c=0;
for(j=2;j<i/2;j++)
{
if(i%j==0)
{
c++;
}
if(c!=0)
{
sum=sum+num;
}
System.out.println(sum);
}
}
}
}
}