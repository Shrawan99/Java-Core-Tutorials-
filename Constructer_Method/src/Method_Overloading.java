
public class Method_Overloading {

	public static void main(String[] args) {
		Google you=new Google();
		you.getAdress("Shrawan Raut");
		you.getSum(10, 20);

	}

}

class Google{
	Google(){
		System.out.println("No need to call me");
	}
	public void getAdress(String name){
		System.out.println("My name is "+name);
	}
	public void getSum(int x, int y){
		System.out.println("Sum = "+(x+y));
	}
	
}