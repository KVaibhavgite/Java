class I2
{
public static void main(String[]args)
{
int a=12,b=20,c=11;
a=++a;
b=a-- + ++c + a-- + --c;
c= b++ + ++a;
System.out.println("a:"+a);//12
System.out.println("b:"+b);//49
System.out.println("c:"+c);//60
}
}

