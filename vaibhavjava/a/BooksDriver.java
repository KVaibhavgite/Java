abstract class Books
{
      abstract  void read();{}
      abstract  int buy(int a);{}
}
 class Aptitude extends Books 
{
	void read()
   {
	  System.out.println("Aptitudes question and how to slove the problem");
   }
  int buy(int a)
   {
   return a;
  //System.out.println(a);
   }
}
 class Java extends Books
{
	void read()
    {
    System.out.println("java book read topic and understand program");
    }
   int buy(int b)
    {
    return b;
	//System.out.println(b);
    }
	
} 
class BooksDriver
{
 public static void main(String[]args)
 {
  Aptitude a=new Aptitude();
  a.read();
 int c= a.buy(800);
  System.out.println(c);
  Java j=new Java();
  j.read();
  int f=j.buy(1500);
  System.out.println(f);
 }
}
