/* WAJP to count factors of number*/
class CountNumberOfFactor
{
public static void main(String[]args)
{
int num=10;
int count=0;
for(int i=1;i<=num;i++)
{
if(num%2==0)
{
System.out.println(i);//1 2 3 4 5 6 7 8 9 10
count++;
}
}
System.out.println("number of factor:"+count);//number of factor=10
}
}