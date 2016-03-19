import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	int count=0;
	int factorial=1;
	System.out.println("Enter an integer");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	/*if(n<0)

		System.out.println("Factorial of negative no. deosn't exist");
	else{*/
		for(count=1;count<=n;++count){
			factorial*=count;
		}
		System.out.println("Factorial= "+factorial);
	}

}

