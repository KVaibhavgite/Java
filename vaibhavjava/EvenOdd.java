import java.util.Scanner;
class EvenOdd
{
public static void main (String[]args)
{
System.out.println("Enter an integer to check if it is odd or even");
 int a;
 Scanner input=new Scanner(System.in);
a =input.nextInt();
if(a%2==0)
{
System.out.println("Enter an integer is a even number");
}
else
{
System.out.println("Enter an integer is a odd number");
}
}
}