import java.util.Scanner;
class SquareInput
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the value to gatting Square:");
int i=input.nextInt();
Square.printlnSquare(i);
}
}
 
class Square
{
public static void printlnSquare(int i)
{
System.out.println(i+"="+i*i);
}
}