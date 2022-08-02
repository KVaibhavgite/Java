class Prime
{
public static void main(String[]args)
{
int [] a={11,16,23,14,7,12,8,10};
for(int i=2;i<a.length-1;i++)
{
if(a[i]%i==0)
{
System.out.println(a[i]);
}
}
}
}
