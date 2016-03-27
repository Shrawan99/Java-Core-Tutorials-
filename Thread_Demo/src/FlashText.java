import javax.swing.*;
/*
 <applet code="FlashText" width="400" height="200">
 </applet>
 */
public class FlashText extends JApplet implements Runnable{
	private JLabel lb1=new JLabel("Welcome",JLabel.CENTER);
	
	public FlashText(){
		add(lb1);
	    new Thread(this).start();
		
	}
	public static void main(String[] args){
		new FlashText();
	}	
	

	@Override
	public void run() {
		try{
			while(true)
			{
				if(lb1.getText()==null){
					lb1.setText("Welcome");
				}
				else{
					lb1.setText(null);
				}
						
				Thread.sleep(200);
				
			}
			
		}
		catch(InterruptedException ex){
			
		}

		
	}
}
	



