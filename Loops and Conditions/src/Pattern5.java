import java.util.Scanner;


public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number your want to Print!!!");
		
		Scanner value= new Scanner (System.in);
		String val=value.nextLine();
		int n=Integer.parseInt(val);
		

		for(int i=n;i>0;i--){
			
			for (int j=i;j>0;j--){
				
				System.out.print("*");
		}
			System.out.print("\n");
	}

	}

}
