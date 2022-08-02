abstract class vehicles
	{
abstract void start();
}

class Car1 extends vehicles
{
 void start()
{
System.out.println("Car start with kays");
}
}

class Bike1 extends vehicles
{
	void start()
{
System.out.println(" Bike start with kicks");
}
}
class vehiclesDriver
{
public static void main(String[]args)
{
Car1 v=new Car1();
v.start();
Bike1 v1=new Bike1();
v1.start();
}
}