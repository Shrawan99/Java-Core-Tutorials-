
public class Arithmetic_Operator {

	public static void main(String[] args) {
			int a=10;
			int b=20;
			int c=30;
			int d=40;
			System.out.println("a+b="+(a+b));//addition
			System.out.println("a-b="+(a-b));//subtraction
			System.out.println("a*b = "+(a * b));//Multiplication
			System.out.println("b/a = "+(b / a));//Division
			System.out.println("b%a = "+(b % a));//Modulo
			System.out.println("c%a = "+(c % a));
			System.out.println("a++ = "+(a++));//post Increment
			System.out.println("a-- = "+(a--)); // Check the difference in d++ and ++d
			System.out.println("d++ = "+(d++));
			System.out.println("++d = "+(++d));//Pre Increment
			System.out.println("\n***************");
			System.out.println("we are moving to Relational \nOperator Zone Exapmles");
			System.out.println("***Here we Go***\n\n");
			Relational_Operator opt=new Relational_Operator();
			}
	
	
	
	
			
	}

class Relational_Operator{
	public Relational_Operator(){
		
		int x =10; int y =20;
		System.out.println("x == y = "+(x == y));
		System.out.println("x != y = "+(x != y));
		System.out.println("x > y = "+(x > y));
		System.out.println("x < y = "+(x < y));
		System.out.println("x >= y = "+(x >= y));
		System.out.println("x <= y = "+(x <= y));
	}
	
}


