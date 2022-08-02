class Square extends Shape
{
int side;
Square(int side)
{
this.side=side;
}
public void area()
{
System.out.println("area:"+side*side);
}
}