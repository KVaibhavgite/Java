class countofprimenum
{
public static boolean isprime(int n)
{
int flag=1;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
flag=2;
break;
}
}
if(flag==1)
{
return true;
}
else
{
return false;
}
}
public static void main(String ... args)
{
int n1=1,n2=20;
int count=0;
for(int i=n1;i<n2;i++)
{
 if(isprime(i))
 count++;

}
System.out.println("total no of prime number:"+count);
}
}