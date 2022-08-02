/*WAJP to count even number between to 100 to 200.*/
class PrintEvenNumberReturn
{
public static void main(String[]args)
{
for(int i=100;i<200;i++)
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