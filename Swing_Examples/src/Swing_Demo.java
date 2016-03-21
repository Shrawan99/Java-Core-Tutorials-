import javax.swing.*;
public class Swing_Demo{
		
public static void main(String[] args){
	
	JOptionPane.showMessageDialog(null, "Hello Nepal", "Mero Nepal", JOptionPane.WARNING_MESSAGE);
	
	String no1=JOptionPane.showInputDialog(null,"Enter First Number");
	String name=JOptionPane.showInputDialog(null,"Enter Good Name");
	
	int i=Integer.parseInt(no1);
	String no2=JOptionPane.showInputDialog(null,"Enter Second Number");
	int j=Integer.parseInt(no2);
	int sum=i+j;
	String nameFinal=name.concat(no1);
	JOptionPane.showMessageDialog(null,"The Sum is="+sum+nameFinal);
	
	
}	
	
}
