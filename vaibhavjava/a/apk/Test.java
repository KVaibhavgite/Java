import java.util.Scanner;
class Test
{
	int a;
	Test(int a)
		{
		this.a=a;
	}
	void show()
		{
		System.out.println("a:- "+a);
	}
	
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=s.nextInt();
		Test r=new Test(num);
		do{
		r.show();
		num++;
		}
		while(num<5);
		
	}
}
