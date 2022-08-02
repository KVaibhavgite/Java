/*Design a method which can accept a number and return the count of digit in a number*/
class CountOfDigitsInNumber
{
public static void main(String[]args)
{
CountOfDigitsInNumber a=new CountOfDigitsInNumber();
System.out.println(a.countDigit(12345678));
}
public int countDigit(int num)
{
int count=0;
int sum=0;
while(num!=0)
{
int digit=num%10;
sum=sum+digit;
num=num/10;
count++;
}
return count;
}
}