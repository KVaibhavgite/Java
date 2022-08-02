class AccountDetail
{
String account_holher_name;
String ifsc;
int account_no;
double balance;
}
public void displayDetails()
{
System.out.println("Account Holder Name:-"+account_holder_name);
System.out.println("IFSE Code:-"+ifsc);
System.out.println("Account number:-"+account_no);
System.out.println("Account Balance:-"+balance+"Rs");
System.out.println("*************************************");
}
public void setDetails(String n,String i,int a,double b);
{
 account_holher_name=n;
 ifsc=i;
 account_no=a;
 balance=b;
 }


