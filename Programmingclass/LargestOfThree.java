/* WAJP to find the largest of 3 number by using else if ladder*/
class LargestOfThree
{
public static void main(String[]args)
{
int a=34,b=44,c=27;
if(a>b&&a>c)
System.out.println(a+" is Largest");
else if(b>c)
System.out.println(b+" is Largest");
else
System.out.println(c+" is Largest");
}
}