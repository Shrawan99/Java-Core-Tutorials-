import java.util.Scanner;

public class Divisior {

	public static void main(String[] args) {
		System.out.println("Enter an integer");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("\nDivisor");
		for(int i=1;i<=n;i++){
			if(n%i==0){
				
				System.out.println(i);
			}
		}
		}

	}

