import java.util.Scanner;


public class Loops_Conditions {

	public static void main(String[] args) {
		
		System.out.println("!!!Welcome to Home Security System!!!\nPlease verify yourself\nEnter Your Password");	
		Scanner sc=new Scanner(System.in);//Input from User
		String password=sc.next();
		String pwd1=password.trim();
		String pwd="12345";
		
		if (pwd1==pwd)	
		{
		System.out.println("!!!Welcome Home Shrawan!!!");	
		}
		
		else
		{
			System.out.println("You are Thief");	
			System.out.println("You are Thief");
			System.out.println("You are Thief");
			System.out.println("You are Thief");
		}

	}

}
