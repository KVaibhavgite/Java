/*Design a method which can accept a number and return the count of factor*/
class CountOfFactorByReturn
{
public static void main(String[]args)
{
int num=20;
System.out.println(printCount(num));//6
}
public static int printCount(int num)
{
int count=0;
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
count++;
}
}
return count;
}
}