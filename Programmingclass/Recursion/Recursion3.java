/* Design a method which can accept an integer no. and print Hello at many times as the no. using recursion cell*/
class Recursion3
{
public static void printHello(int n)
{
System.out.println("hello"+n);//Hello Hello Hello Hello Hello
if(n>1)
{
printHello(n-1);
}
}
public static void main(String[]args)
{
new Recursion3().printHello(5);
}
}