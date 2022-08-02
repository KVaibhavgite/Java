/*Design a method which accept a number and return the factorial of a number*/
class Fact
{
public static int fact(int n)
{
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
return fact;
}
public static void main(String[]args)
{
System.out.println(6+"!="+fact(6));//120
if(fact=n)
{
System.out.println(" Number is Strong");
}
else
{
System.out.println(" not Storng Number"); 
}

//System.out.println(7+"!="+fact(7));//5040
//System.out.println(8+"!="+fact(8));//40320
}
}