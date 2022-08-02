/*WAJP to check wheather a number is strong number or not*/
class main
{
	public static void main(String[] args)
	{
		int number=144;
		int fac,sum = 0;
		int n = number;
		while(n != 0)
		{	
			fac = 1;
			int r = n % 10;
			//calculating factorial of r
			for(int i = r ; i >= 1 ; i--)
			fac = fac * i;
			//storing sum of factorial of all digits of the number
			sum = sum + fac;
			n=n/10;
		}
		//condition for strong number
		if(sum == number)
			System.out.println("Strong Number");//display the result
		else
			System.out.println("Not a Strong Number");
		//closing scanner class(not compulsory, but good practice)												
	}
}