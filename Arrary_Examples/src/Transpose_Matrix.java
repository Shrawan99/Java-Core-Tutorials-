
public class Transpose_Matrix {

	public static void main(String[] args) {
		
		int matrix[][]={
			{1,2,3},
			{8,5,6},
			{7,4,9}
	};
		System.out.println("Before Transpose"+"\n");
		for(int c=0;c<3;c++){
			for (int d=0;d<3;d++){
				System.out.print(matrix[c][d]+"  ");
						}
			System.out.print("\n");
		} 
		System.out.print("\n");
		
		
		System.out.println("After Transpose"+"\n");
		
		int transpose[][]=new int[3][3];//Initialize transpose matrix
		for(int c=0;c<3;c++){
			for (int d=0;d<3;d++){ 
				transpose[d][c]=matrix[c][d];//transpose means changing rows(c) to column(d)
			}
		}
			for(int c=0;c<3;c++){
				for (int d=0;d<3;d++){
					System.out.print(transpose[c][d]+"  ");
							}System.out.print("\n");
			}
		
	}

}
