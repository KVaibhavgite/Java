import java.util.Scanner;
import java.util.*;
class TataSky
{
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter 0 for Rechrge");
System.out.println("Enter 1 for Language");
System.out.println("Enter 2 for new Registration");
int n=scan.nextInt();
private double price;
public double getprice()
	{
		return price;
	}
	TataSky(){}
TataSkay(String name,String id,String passward,long contactno,double balance)
	{
		this.name=name;
		this.id=id;
		this.passward=passward;
		this.contactno=contactno;
		this.balance=balance;
	}
	void display()
	{
		System.out.println("Enter the user name:-"+name);
		System.out.println("Enter the user passward:-"+passward);
		System.out.println("Enter the user contact no:-"+contactno);
		System.out.println("Enter the user balance:-"+balance+" in rs");
		System.out.println("************************************************");

	}

switch (n)
{
case 0:
      {
      interface Recharge
      {
      public void addMoney();
      }
	  break;
      }
case 1:
      {
      interface Language
      {
      public void changeLanguage();
      }
	  break;
      }
case 2:
       {
       interface registration
       {
       public void registration();
       }
	   break;
       }
default:
	    {
	    System.out.println("This is a Wrong choose");
        System.out.println("_____________Thank You______________");
		break;
		}

}
}
}
