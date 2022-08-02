/* WAJP to find the largest of 4 number by using else if ladder */
class LargestOfFour
{
public static void main(String[]args)
{
int a=34,b=44,c=27,d=77;
if(a>b&&a>c&&a>d)
System.out.println(a+" is Largest");
else if(b>c&&b>d)
System.out.println(b+" is Largest");
else if(c>d)
System.out.println(c+" is Largest");
else
System.out.println(d+" is Largest");
}
}