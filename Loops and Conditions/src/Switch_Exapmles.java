import java.util.Scanner;


public class Switch_Exapmles {

	public static void main(String[] args) {
		
		System.out.println("Enter the grade you got your Exam");
		Scanner mark=new Scanner(System.in);
		String grade=mark.next();	
		
		switch(grade){
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Not Good");
			break;
		case "D":
			System.out.println("Bad");
			break;
		case "E":
			System.out.println("Very Bad");
			break;
		default:
			System.out.println("Invalid Grade");
			break;
		
		}
		System.out.println("Your grade is "+grade);

	}

}
