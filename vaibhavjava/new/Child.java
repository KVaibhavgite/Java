class Child extends Parent
{
static 
{
System.out.println("static block From child");
}
{
System.out.println("non static block From child");
}
Child()
{
System.out.println("From Child");
}
}