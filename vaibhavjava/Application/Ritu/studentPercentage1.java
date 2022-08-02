import java.util.Scanner;

public class studentPercentage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i;
		int tot=0;
		System.out.println("Enter the no. of subject are uesd:- ");
		int no=scan.nextInt();
		System.out.println("Enter the mark of subjects:-");
		int [] a = new int[no];
		for(i=0;i<no;i++) {
			a[i] = scan.nextInt();
		}
		for(i=0;i<no;i++) {
			tot=tot+a[i];
		}
		int per=tot/no;
		System.out.println("Total marks of given subject:-"+tot);
		System.out.println("percentages: "+per);
		
      
	}

}
