import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
public class mouseEventOne extends JFrame implements MouseListener {
	public Container cnt;
	public JButton btn,bt2,bt3;
	public JLabel jbl;
	public ImageIcon icon;
	public Color color;
	public JToolBar jt;
	
	public mouseEventOne(){
		super("Mouse vai");
		setSize(200, 300);
		cnt=getContentPane();
		jt=new JToolBar();
		jbl=new JLabel();
		cnt.add(jbl);
		cnt.setLayout(new FlowLayout());
		//icon=new ImageIcon("image/banner4.jpg");
		btn=new JButton("Color");
		//btn=new JButton(icon);
		jt.add(btn);
		 bt2=new JButton("Nothing");
		jt.add(bt2);
		bt3=new JButton("Something");
		jt.add(bt3);
		JButton bt4=new JButton("Everything");
		jt.add(bt4);
		JButton bt5=new JButton("Always");
		jt.add(bt5);
		cnt.add(jt);
		btn.addMouseListener(this);
		bt2.addMouseListener(this);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
				
	}
	public static void main(String[] args) {
		mouseEventOne mouse=new mouseEventOne();
		
	}
  @Override
	public void mouseClicked(MouseEvent a) {
	  if(a.getSource()==btn){
		 jbl.setText("Please choose background color:") ;
		 color=JColorChooser.showDialog(cnt, null, color.RED);
		 cnt.setBackground(color);
		  
	  }
	  else if(a.getSource()==bt3){	
		  jbl.setText("Please choose background color:") ;
			 color=JColorChooser.showDialog(cnt, null, color.RED);
			 cnt.setBackground(color);
		  
	  }	  
		
	}

 @Override
	public void mouseEntered(MouseEvent a) {	 
	 if(a.getSource()==bt2){
		 jbl.setText("Please choose background color:") ;
		 color=JColorChooser.showDialog(cnt, null, color.RED);
		 cnt.setBackground(color);
		  
	  }
			  
		  }
		
	
	@Override
	public void mouseExited(MouseEvent e) {
		//cnt.setBackground(Color.BLUE);
		//btn.setBackground(Color.green);
		
	}

   @Override
	public void mousePressed(MouseEvent e) {
	   if(e.getClickCount()==2){
		   jbl.setText("Hi I am bore->") ;
		   
	   }
		
	}


   @Override
	public void mouseReleased(MouseEvent e) {
		
	}

}
