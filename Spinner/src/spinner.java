import javax.swing.*;
import javax.swing.event.*;
import java.awt.BorderLayout;
public class spinner extends JFrame {
	JSpinner Spinner=new JSpinner();
	private JLabel label=new JLabel(" ",JLabel.CENTER);
	public spinner(){
		add(Spinner,BorderLayout.NORTH);
		add(label,BorderLayout.CENTER);
		Spinner.addChangeListener(new ChangeListener(){
			public void stateChanged(javax.swing.event.ChangeEvent e){
				label.setText("previous value:"+Spinner.getPreviousValue()+"current value:"+Spinner.getValue()+"next value"+Spinner.getNextValue());
				
			}
		});
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]){
		new spinner();
	}
	
	
}
