/* WAJP to find the Smallest of 3 number by using else if ladder */
class SmallestOfThree
{
public static void main(String[]args)
{
int a=34,b=44,c=27;
if(a<b&&a<c)
System.out.println(a+" is Smallest");
else if(b<c)
System.out.println(b+" is Smallest");
else 
System.out.println(c+" is Smallest");
}
}