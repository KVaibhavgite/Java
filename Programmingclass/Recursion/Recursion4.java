/*desing a method which can accept an two no. and print all the no betwwen those two no. using recursion call*/
class Recursion4
{
public void printNumber(int m,int n)
{
if(m<n)
{
printNumber(m,n-1);
}
System.out.println(n);//1 2 3 4 5 6 7 8
}
public static void main(String[]args)
{
new Recursion4().printNumber(1,8);
}
}