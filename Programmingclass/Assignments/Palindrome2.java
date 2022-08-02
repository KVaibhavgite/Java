/*design a method can accept a number and returns true if number is palindrome else returns false.*/
class Palindrome2
{
public static boolean printnum(int num)
{
int temp=num;
int rev=0;
while(temp!=0)
{
rev=rev*10+temp%10;
temp=temp/10;
}
if(num==rev)
{
return true;
}
else
{
return false;
}

}
public static void main(String[]args)
{
System.out.println(printnum(1234));
}
}