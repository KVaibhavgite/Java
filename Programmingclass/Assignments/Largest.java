/*WAJP to find out the largest of 3 number using conditional operaters*/
class Largest
{
public static void main(String[]args)
{
int a=111;
int b=101;
int c=93;
int d=(a>b&&a>c)?a:(b>c)?b:c;
System.out.println("Largest no. is :"+d);
}
}