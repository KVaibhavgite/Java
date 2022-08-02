/*Design a method which can accept 3 number and print the smallest.*/
class SmallestOfThree
{
public static void smallestOfThree(int n1,int n2,int n3)
{
if(n1<n2&&n1<n3)
System.out.println(n1+" is a smallest");
else if(n2<n3)
System.out.println(n2+" is a smallest");
else
System.out.println(n3+" is a smallest");
}
public static void main(String[]args)
{
int n1=15,n2=56,n3=22;
smallestOfThree(n1,n2,n3);
}
}
