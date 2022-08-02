/* WAJP to find the Smallest of 4 number by using else if ladder */
class SmallestOfFour
{
public static void main(String[]args)
{
int a=34,b=44,c=27,d=77;
if(a<b&&a<c&&a<d)
System.out.println(a+" is Smallest");
else if(b<c&&b<d)
System.out.println(b+" is Smallest");
else if(c<d)
System.out.println(c+" is Smallest");
else
System.out.println(d+" is Smallest");
}
}