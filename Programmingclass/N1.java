class N1
{
public static void main (String[]args)
{
int a=129;
byte b=(byte)a;
System.out.println(b);//-127
char ch=(char)a;
System.out.println(ch);//?
double d=123.5678;
a=(int)d;
System.out.println(a);//123
}
}