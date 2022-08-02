class DriverAccount
{
public static void main(String[]args)
{
SavingsAccount a=new SavingsAccount("abx",123654,"sbin001",1200);
LoanAccount a1=new LoanAccount("asx",45632,"sbbin002",1200,1500,25000);
System.out.println("account holder name:"+a.name);
System.out.println("account number:"+a.acno);
System.out.println("account ifsc::"+a.ifsc);
System.out.println("account balance:"+a.bal);
System.out.println("***************************************");
System.out.println("account holder name:"+a1.name);
System.out.println("account number:"+a1.acno);
System.out.println("Accont ifsc:"+a1.ifsc);
System.out.println("Account loan amounnt:"+a1.amount);
System.out.println("account  loan emi:"+a1.emi);
System.out.println("account loan interest:"+a1.interest);
}
}
