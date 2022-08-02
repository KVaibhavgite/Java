import java.util.Scanner;
class Prime
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the your values");
int n=sc.nextInt();
int flag=1;
for(int i=2;i<=n;i++)
{
if(n%i==0)
{
flag=2;
break;
}
}
if(flag==1)
{
System.out.println(n+"="+"is a prime number");
}
else
{
System.out.println(n+"="+"is not  a prime number");
}
}
}
