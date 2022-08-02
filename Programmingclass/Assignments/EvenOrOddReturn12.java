/* WAJP to count odd number between 150 and550.*/
class EvenOrOddReturn12
{
public static void main(String [] args)
{
int count=0;
for(int i=150;i<=550;i++)
{
if(evennum(i))
	{
System.out.println(count);
count++;
}
}
}
public static boolean evennum(int n)
	{
		return n%2!=0;
	}
}