class SavingsAccount extends Account
{
double bal;
SavingsAccount(String name,long acno,String ifsc,double bal)
{
super(name,acno,ifsc);
this.bal=bal;
}
}
