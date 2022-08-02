class Circle extends Shape
{
int radius;
Circle(int radius)
{
this.radius=radius;
}
public void area()
{
System.out.println("area:"+Math.PI*radius*radius);
}
}