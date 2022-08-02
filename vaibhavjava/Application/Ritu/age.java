
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class age {
	public static void main(String[]args) throws IOException {
		// InputStream is =new FileInputStream("./data/sample1.txt");
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the your adhar number:- ");
		String adharNumber= bufferedReader.readLine();
		System.out.println("Enter the your date of birth:- ");
		String DOB= bufferedReader.readLine();
		System.out.println("Enter the your comorbidity:- ");
		String comorbidity=bufferedReader.readLine();
		
		age.calculateVaccDriveList(adharNumber,DOB,comorbidity);
		bufferedReader.close();
		
	}

	public static void calculateVaccDriveList(String adharNumber, String DOB, String comorbidity) {
		// TODO Auto-generated method stub
		String arr[]=DOB.split("/");
		int d=Integer.parseInt(arr[0]);
		int m=Integer.parseInt(arr[1]);
		int y=Integer.parseInt(arr[2]);
		
		var d1=LocalDate.of(y, m, d);
		var d2=LocalDate.now();
		
		var age=Period.between(d1, d2);
		System.out.println("your age is:- "+age.getYears()+" years "+age.getMonths()+" month "+age.getDays()+" days ");
		

		if(60 >= age.getYears()){
			System.out.println("1");
		}
		else if(60<=age.getYears()&&45>=age.getYears()){
			System.out.println("2");
		}
		else{
			System.out.println("you are not vacciented");
		}
		
		
	}
	


	
	
}