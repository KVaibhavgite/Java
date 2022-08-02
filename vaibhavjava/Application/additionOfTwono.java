import java.util.Scanner;
class additionOfTwono
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:- ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:- ");
		int num2=sc.nextInt();

        int result=num1+num2;
		System.out.println("your number addition is :- "+result);
		if(result%2==0){
			System.out.println("Your result is an Even number:- "+result);}
		else{
		System.out.println("Your result is an odd number:- "+result);}
      
	  int flag=1;
	  for(int i=2;i<result;i++)
		{
			if(result%2!=0)
			{
             flag=2;
			 break;
			}
		}
			if(flag==1)
			{
				System.out.println("it is not a prime number:- "+result);
			}
			else
			{
				System.out.println("it is a prime number:- "+result);
			}

        int rev=0;
		 int result1=result;
		while(result1!=0)
		{
			rev=rev*10+result1%10;
			result1=result1/10;
		}
		if(result==rev)
		{
			System.out.println("it is a palindrome number");
		}
		else
		{
			System.out.println("it is not a palindrome number");
		}
	}
} 