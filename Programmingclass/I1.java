class I1
{
public static void main(String[]args)
{
int a=10;
int b=--a;
int c=a++ +b-- + --b + ++a;
int d=--c+ ++b+ --a;
c=--c;
System.out.println(a);//10
System.out.println(b);//8
System.out.println(c);//34
System.out.println(d);//54
}
}
