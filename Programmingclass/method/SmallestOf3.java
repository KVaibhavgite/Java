/* design a method wjhich can accept 3 no. and print the smallest of 3no.*/
class SmallestOf3
{
public static void SmallestOfThree(int n1,int n2,int n3)
{
if(n1<n2&&n1<n3)
{
System.out.println(n1+" is smallest");
}
else if(n2<n3)
{
System.out.println(n2+" is smallest");
}
else
{
System.out.println(n3+" is smallest");
}
}
public static void main(String[]args)
{
int n1=12,n2=55,n3=54;
SmallestOfThree(n1,n2,n3);
}
}
