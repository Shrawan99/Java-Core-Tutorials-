import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	  int reverse=0,rem=0,temp=0;
	  System.out.println("Enter a number");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  temp=n;
	  while(temp>0){
		  rem=temp%10;
		  reverse=reverse*10+rem;
		  temp/=10;
	  }
	  if(reverse==n){
		  System.out.println(n+" is a Palindrome no.");
	  }
	  else{
		  System.out.println(n+" is not a Palindrome no.");
	  }
	}

}
