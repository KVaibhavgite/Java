public class PrintEvenOrOddNumber
{
public static void main(String[]args)
{
int []a ={10,11,12,20,21,22,30,31,32,40,41,44,0,1,2};
for(int i=0;i<=a.length;i++)
{
if(a[i]%2==0)
{
System.out.println("All the even no.:-"+a[i]);
}
else
{
System.out.println("All the odd no.:-"+a[i]);
}
}
}
}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
        at PrintEvenOrOddNumber.main(PrintEvenOrOddNumber.java:8)