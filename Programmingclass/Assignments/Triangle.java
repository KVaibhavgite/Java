class Triangle extend Shape
{
int b;
int h;
Triangle(int b,int h)
{
this.b=b;
this.h=h;
}
public void area()
{
System.out.println("area:"+(0.5*b*h));
}
}