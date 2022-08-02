import java.util.Scanner;
class Pat4
{
public static void main(String[]args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the String which need to printing");
	char in=input.next().charAt(0);
	System.out.println("*********** Printing the pattern *************");

for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{
System.out.print(in);
}
}
System.out.println( );
}
}


