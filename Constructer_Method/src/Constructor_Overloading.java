
public class Constructor_Overloading {

	public static void main(String[] args) {
		Youtube you=new Youtube();
		new Youtube("You Did It");
		new Youtube(10, 20);
			}
}

class Youtube{
	
	Youtube(){
		System.out.println("I am First Constructor");
	}
	Youtube(String name){
		
		System.out.println("I am Second Constructor "+name);
	}
   Youtube(int x, int y){
		
		System.out.println("I am addition Machine="+(x+y));
	}
}
