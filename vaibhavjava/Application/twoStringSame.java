import java.util.Scanner;

public class twoStringSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st value:- ");
		String str=scan.nextLine();
		System.out.println("Enter the 1st value:- ");
		String str1=scan.nextLine();
		
		int len=str.length();
		System.out.println(len);
		int len1=str1.length();
		System.out.println(len1);
		
		if(str.equals(str1))
		{
			if(len==len1)
			{
				System.out.println(len*2);
			}
		}
		else
		{
			System.out.println("0");
		}
		
		

	}

}