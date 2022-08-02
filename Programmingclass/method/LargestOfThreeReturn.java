/*Design a method which can  using return statement accept 3 number and print the largest.*/
class LargestOfThreeReturn
{
public static int largestOfThree(int n1,int n2,int n3)
{
if(n1>n2&&n1>n3)
return n1;
else if(n2>n3)
return n2;
else
return n3;
}
public static void main(String[]args)
{
int n1=15,n2=56,n3=22;
int largest=largestOfThree(n1,n2,n3);
System.out.println(largest+" is largest");
}
}
