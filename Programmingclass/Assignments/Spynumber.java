/*WAJP to check wheather a number is spy no. or not.*/
class Spynumber
{
public static void main(String[]args)
{
int num=11,sum=0,prod=1,num1=num;
while(num>0)
{
int digit=num%10;
sum=sum+digit;
prod=prod*digit;
num=num/10;
}
if(sum==prod)
{
System.out.println(num1+" Spy number");
}
else
{
System.out.println(num1+" not a Spy number");
}
}
}
