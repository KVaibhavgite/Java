/*WAJP to print Fibonacci method.*/
class FibonacciMethod1
{
public static void main(String[]args)
{
int n=10,n1=0,n2=1,i=1;
System.out.println( "Fibonacci series"+n+"term:");
while(i<=n)
{
System.out.print(n1+" ");
int num=n1+n2;
n1=n2;
n2=num;
i++;
}
}
}