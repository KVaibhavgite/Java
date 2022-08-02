/*Design a method which can accept a number and return the sum of even digit of a number
ex1 number=1234
   o/p=6
ex2 number=5896
    o/p=14*/
class ReturnSumOfEvenNumber
{
public static void main(String[]args)
{
int num=5896;
int sum=0;
while(num!=0)
{
int digit=num%10;
if(digit%2==0)
	{
sum=sum+digit;
}
num=num/10;
}
System.out.println(sum);
}
}