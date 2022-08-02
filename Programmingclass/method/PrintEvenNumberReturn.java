/* WAJP ,to print even no. between 50 to 100 by using return statement.*/
class PrintEvenNumberReturn
{
public static void main(String[]args)
{
for(int i=50;i<100;i++)
	{
	if(isEven(i))
{
System.out.println(i);
}
}
}
public static boolean isEven(int num)
{
return num%2==0;
}
}
