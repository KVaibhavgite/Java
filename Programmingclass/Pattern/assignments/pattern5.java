/*
1
1a
1a3
1a3b
1a3b5
*/
class pattern5
{
public static void main(String ... args)
{
	int n=5;
for(int i=1;i<=n;i++)
{
char ch='a';
int a=1;
 for(int j=1;j<=n;j++)
 {
 if(i>=j)
 {
	 if(j%2!=0)
	 {
 System.out.print(a++);
 a++;
 }
 else
	 System.out.print(ch++);
 }
}
System.out.println(" ");
}
}
}