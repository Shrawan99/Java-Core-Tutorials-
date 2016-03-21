
public class Calculator {

	public static void main(String[] args) {
		
		calc value=new calc();
		
		value.sub(50, 30);
		value.mul(10, 30);
	}
}

class calc{
	public void sub(int a,int b){
		int sub=a-b;
		System.out.println("The Sub is:"+sub);
	}
	
	public void mul(int a,int b){
		int mul=a*b;
		System.out.println("The product is:"+mul);
	}
	public static  void sum(){
		final int a=2;
		int b=3;
		int sum=a+b;
		System.out.println("The sum is:"+sum);
	}
	
	
	
	
	
	
	
}
