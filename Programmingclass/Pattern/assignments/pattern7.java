/*
1a3b5
1a3b5
1a3b5
1a3b5
1a3b5
*/
class pattern7
{
public static void main(String ... args)
{
int n=5;
for(int i=1;i<=n;i++)
{ int a=1;
 char ch='a';
 for(int j=1;j<=n;j++)
 {
 if(j%2!=0)
 {
 System.out.print(a++);
 a++;
 }
 else
 {
 System.out.print(ch++);
 }
 }
 System.out.println(" ");
}
}
}