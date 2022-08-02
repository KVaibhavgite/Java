/*Design a method which can accept a number and return the sum of digit*/
class SumOfDigitUsingMethod
{
public static void main(String[]args)
{
 SumOfDigitUsingMethod a=new  SumOfDigitUsingMethod();
 System.out.println(a.sumOfDigit(123456));//21
 System.out.println(a.sumOfDigit(5556));//21
 System.out.println(a.sumOfDigit(12344321));//20
 }
 public int sumOfDigit(int num)
 {
 int sum=0;
 while(num!=0)
 {
 int digit=num%10;
 sum=sum+digit;
 num=num/10;
 }
 return sum;
 }
 }

