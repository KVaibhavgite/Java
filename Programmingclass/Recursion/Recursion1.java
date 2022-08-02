/*Recursion for infinite number of times*/
class Recursion1
{
public static void main(String[]args)
{
demo();
}
public static void demo()
{
System.out.println("Hello");//Hello...........StackOverFlowError(infinite loop)
demo();
}
}