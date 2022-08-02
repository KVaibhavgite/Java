/* design a method wjhich can accept 4 no. and print the largest of 4no.*/
class LargestOf4
{
public static void largestOfThree(int n1,int n2,int n3,int n4)
{
if(n1>n2&&n1>n3&&n1>n4)
{
System.out.println(n1+" is largest");
}
else if(n2>n3&&n2>n4)
{
System.out.println(n2+" is largest");
}
else if(n3>n4)
{
System.out.println(n3+" is largest");
}
else
{
System.out.println(n4+" is largest");
}
}
public static void main(String[]args)
{
int n1=12,n2=55,n3=54,n4=88;
largestOfThree(n1,n2,n3,n4);
}
}
