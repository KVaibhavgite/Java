/*output=1 1 1 1 1
         a a a a
         1 1 1
         a a
         1
         */
class Pattern12
{
public static void main(String[]args)
{
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i<=j)
{
if(i%2!=0)
{
System.out.print(1+" ");
}
else
{
System.out.print("a"+" ");
}
}
}
System.out.println( );
}
}
}