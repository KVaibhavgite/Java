class Books
{
public void read();
public int buy();
}

class Aptitude extends Books
{
public void read()
{
System.out.println("Aptitudes question and how to slove the problem");
}
public int buy(int a)
{
return a;
}
}

class Java extends Books
{
public void read()
{
System.out.println("java book read topic and understand program");
}
public int buy(int b)
{
return b;
}
}

class BooksDriver
{
public static void main(String[]args)
{
Aptitudes a=new Aptitudes();
a.read();
a.buy(800);
Java b=new Java();
b.read();
b.buy(1500);
}
}