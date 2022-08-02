class Pattern8
{
public static void main(String[]args)
{
int n=5;
char n1='a';
for(int i=1;i<=n;i++)
{
	n1='a';
for(int j=1;j<=n;j++)
{
if(i>=j)
{
System.out.print(n1);
n1++;
}
}
System.out.println(" ");
}
}
}
/*ans:a
     ab
     abc
     abcd
     abcde */