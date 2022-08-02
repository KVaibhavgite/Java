abstract class vehicles
{
abstract void car();
abstarct void bike();
}

class Car extends vehicles
{
public void car()
{
System.out.println("Car start with kays");
}
}

class bike extends vehicles
{
public void bike()
{
System.out.println(" Bike start with kicks");
}
}

class vehiclesDrivers
{
public static void main(String[]args)
{
vehicles v=new Car();
v.car();
vehicles v1=new bike();
v1.bike();
}
}
