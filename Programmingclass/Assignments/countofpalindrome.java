// wajp to print palindrome no bet two numbers and count them.
class countofpalindrome
{
public static boolean ispalindrome(int num)
{
int temp=num;
int rev=0;
while(temp!=0)
{
rev=rev*10+temp%10;
temp=temp/10;
}if(num==rev)
{
return true;
}
else
{
return false;
}
}
public static void main(String ... args)
{   int count=0;
	int n1=100,n2=200;
	for(int i=n1;i<=n2;i++)
	{
	if(ispalindrome(i))
	   {
	     count++;
	   }
	 
        }
		  System.out.println("Total count of Palindrome num:"+count);
  }
}