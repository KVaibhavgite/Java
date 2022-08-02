/*output=ajaja
         ajaja
	 ajaja
	 ajaja
	 ajaja */
class Pattern11
{
public static void main(String[]args)
{
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j%2!=0)
{
System.out.print(1+" ");
}
else
{
System.out.print("a"+" ");
}
}
System.out.println( );
}
}
}