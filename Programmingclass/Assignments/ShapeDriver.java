class ShapeDriver
{
public static void main(String[]args)
{
Shape[] sh=new Shape[3];
sh[0]=new Circle[5];
sh[0]=new Triangle[2,6];
sh[0]=new Square[5];
for(int i=0;i<sh.length;i++)
{
sh[i].area();
}
}
}