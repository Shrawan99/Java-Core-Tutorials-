
public class ArrayCopy {

	public static void main(String[] args) {
		int A1[]={10,20,30,40,50,60,70,80,90,100};
		int A2[]={1,2,3,4,5,6,7,8,9,10};
		 
		System.out.println("The first Array is: ");
		for(int i=0;i<10;i++)
			System.out.print(A1[i]+" ");
		
		System.out.println("\nThe Second Array is: ");
		for(int i=0;i<10;i++)
			System.out.print(A2[i]+" ");
		
		System.arraycopy(A1,5,A2,5,5);
		
		System.out.println("\nThe second Array after after calling arraycopy():");
		for(int i=0;i<10;i++)
		System.out.println(A2[i]+" ");

	}

}
