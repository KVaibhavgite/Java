/*WAJP,to print Second Smallest element of an arrays.*/
class SecondSmallestNumber
{
public static void main(String[]args)
{
int []a={11,7,8,23,44,43,78};
int smallest=a[0],secsmallest=a[1];
for(int i=0;i<a.length;i++)
{
if(a[i]<smallest)
{
secsmallest=smallest;
smallest=a[i];
}
else if(a[i]<secsmallest&&a[i]!=smallest)
{
secsmallest=a[i];
}
}
System.out.println("Smallest is:- "+smallest);
System.out.println("Second Smallest is:- "+secsmallest);
}
}