	import java.util.Scanner;
	
public class Calculator {
	public static int add(int a,int b){
		int c=a+b;
		return c;
	}
		public static int sub(int a,int b){
			int c=a-b;
			return c;	
		}
		public static int mul(int a,int b){
			int c=a*b;
			return c;
		}
		public static int div(int a,int b){
			int c=a/b;
			return c;
		}
		public static int mod(int a,int b){
			int c=a%b;
			return c;
		}
	public static void main(String[] args) {
		
		System.out.println("*****Welcome in my Calculator*****");
		System.out.print("\n");
		
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtract");
		System.out.println("Press 3 for Multiply");
		System.out.println("Press 4 for Divide");
		System.out.println("Press 5 for Modulos");
		System.out.print("\n");
		
		System.out.println("***Give first no.***");
		Scanner in1=new Scanner(System.in);
		int x=in1.nextInt();
		int y=in1.nextInt();
		
		System.out.println("***Enter your choice***:->");
		Scanner in3=new Scanner(System.in);
		int c=in3.nextInt();
		

		int z=0;
		switch(c)
		{
		case 1:
		z=add(x,y);
		break;
		
		case 2:
			z=sub(x,y);
				break;
		
		case 3:
			z=mul(x,y);
				break;
		
		case 4:
			z=div(x,y);
				break;
				
		case 5:
			z=mod(x,y);
				break;
		default:
			System.out.println("*****Wrong Choice!!!!******");
			break;
		}
		System.out.println("****Result***-->");
		System.out.println(z);
		
		System.out.println("Press 6 to continue");
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		if(r==6)
		{
			String[] s=null;
			main(s);
		}
	}

}
