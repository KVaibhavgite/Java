/*WAJP,to print Second Largest element of an arrays.*/
class SecondLargestNumber
{
public static void main(String[]args)
{
int []a={11,7,8,23,44,43,78};
int largest=a[0],seclargest=a[1];
for(int i=0;i<a.length;i++)
{
if(a[i]>largest)
{
seclargest=largest;
largest=a[i];
}
else if(a[i]>seclargest&&a[i]!=largest)
{
seclargest=a[i];
}
}
System.out.println("Largest is:-"+largest);
System.out.println("Second Largest is:-"+seclargest);
}
}