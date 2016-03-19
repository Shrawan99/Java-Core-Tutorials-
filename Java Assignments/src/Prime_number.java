import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt();
		int i;
		int flag=0;
		for(i=2;i<=n/2;i++)
		{
		if(n%i==0)
		{
		
		flag=1;
		break;
		}
		}
		if(flag==0)
		{
		System.out.println(n+" is a Prime number!");
		}
		else{
			System.out.println(n+" is not a Prime number");
		}
		}
	}