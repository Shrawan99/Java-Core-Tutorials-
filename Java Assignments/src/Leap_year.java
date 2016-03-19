import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		
		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		//if year is divisible by 4,it is leap year.
		
		if((year%400==0)||((year%4==0)&&(year%100!=0))){
		System.out.println(year+" is a leap year");
		}
		else{
			System.out.println(year+" is not a leap year");
			
		}

	}

}
