import java.util.Scanner;
class MangoDistribution//only one case pass
{
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the first input");
int num1=scan.nextInt();
System.out.println("Enter the Second input");
int num2=scan.nextInt();

System.out.println(cal_way(num1,num2));

}

public static int cal_way(int num1,int num2)
	{
		if(num1<num2)
		{
			return 0;
		}
		int way=binomial_cofficient(num2+num1-1,num2-1);
		return way;
	}
	public static int binomial_cofficient(int num2,int num1)
	{
		int res=1;
		if(num1>num2-num1)
			num1=num1-num1;

		for(int i=0;i<num1;++i)
		{
			res*=(num2-i);
			res/=(i+1);
		}
		return res;
	}
}