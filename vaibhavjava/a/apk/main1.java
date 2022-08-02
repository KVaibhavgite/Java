import java.util.Scanner;
class main1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your String :- ");
        String str=sc.nextLine();
        String str1=sc.nextLine();
        int len=str.length();
        int len1=str1.length();
        if(len==len1)
        {
			if(str.equals(str1))
			{
				System.out.println(len+len1);
			}
			else
			{
				System.out.println("0"); 
			}
			
        }
		else
		{
			System.out.println("0");
		}
       
    }
}