/*WAJP to find out the Smallest of 3 number using conditional operaters*/
class Smallest1
{
public static void main(String[]args)
{
int a=77;
int b=23;
int c=11;
int d=(a<b&&a<c)?a:(b<c)?b:c;
System.out.println("Smallest no. is :"+d);
}
}