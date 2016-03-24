import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
public class mouseEventTwo extends JFrame implements MouseMotionListener,MouseWheelListener{
	public Container cnt;
	public JLabel lbl,lb2;
	Border border = LineBorder.createBlackLineBorder();
	
		public mouseEventTwo(){
			super("Hello mouse vai:");
			setSize(200, 300);
			setVisible(true);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			cnt=getContentPane();
			lbl=new JLabel();
			lb2=new JLabel();
			cnt.add(lb2);
			cnt.add(lbl);
			cnt.setLayout(new FlowLayout());
			cnt.addMouseMotionListener(this);
			cnt.addMouseWheelListener(this);
			}
	
		public static void main(String[] args) {
     new mouseEventTwo();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		String str="Draged";
		int x=e.getX();
		int y=e.getY();
		lbl.setText("x="+x+"   y="+y);
		if(x>=500){
			if(x<=600){
				lbl.setText("You got it...");
			}
		}
		}

	@Override
	public void mouseMoved(MouseEvent e) {
		String str="Moved";
		int x=e.getX();
	    int y=e.getY();
	    cnt.setBackground(Color.RED);
	    lbl.setText("Find your Treasure by moving your mouse.."+"x="+x+"   y="+y);
		red();
		double i=Math.random()*800;
		int j=(int)i;
		if((x>=j)&(x<=j+100)){
			if((y<=500)&&(y<=600)){
				
				lbl.setText("You got it...");
				cnt.setBackground(Color.GREEN);
				//JOptionPane.showMessageDialog(null, "You find your treasure:");
			}
		}
	}
	public void red(){
		
		//
		
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
	int a=e.getWheelRotation();
	//System.out.println(a);
	if(a==1){
		lb2.setText("Moving Forward");
		lb2.setFont(new Font("Times Roman", Font.ITALIC, 20));
		lb2.setBorder(border);
		}
	else{
		lb2.setText("Moving backward");
	}
	}

}
