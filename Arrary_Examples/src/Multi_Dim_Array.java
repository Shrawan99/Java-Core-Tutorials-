import java.util.Scanner;


public class Multi_Dim_Array {

	public static void main(String[] args) {
		
		System.out.println("Enter the Rows and Comumns of Matrix ");
		
		Scanner input=new Scanner(System.in);
		int r=input.nextInt();//rows
		int c=input.nextInt();//columns
		
		int matrix[][]=new int[r][c];//matrix initialize
		System.out.println("Enter the elements in Matrix");
		for (int x=0;x<r;x++){
			for (int y=0;y<c;y++){
				matrix[x][y]=input.nextInt();//Matrix Input
			}
		}
		System.out.println("Entered the elements in Matrix");
		for(int x=0;x<r;x++){
			for (int y=0;y<c;y++){
				System.out.print(matrix[x][y]+"  ");
						}
			System.out.print("\n");
		} 
		

	}

}