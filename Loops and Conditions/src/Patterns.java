import java.util.Scanner;


public class Patterns {

	public static void main(String[] args) {
		System.out.println("Enter the number your want to Print!!!");
		
		Scanner value= new Scanner (System.in);
		String val=value.nextLine();
		int n=Integer.parseInt(val);
		

		for(int i=0;i<n;i++){
			
			for (int j=1;j<n;j++){
				
				System.out.print(j);
		}
			System.out.print("\n");
	}
		

}
}
