import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ImageDemo extends JFrame implements ActionListener {
	public Container cnt;
	public JLabel lb1;
	public ImageIcon icon;
	public JComboBox box;
	String img_name[]={"a.jpg","b.jpg","c.jpg","d.jpg","e.jpg"};
	public ImageDemo(){
		super("Demo album");
		cnt=getContentPane();
		cnt.setLayout(new FlowLayout());
		lb1=new JLabel("Album");
		cnt.add(lb1);
		box=new JComboBox(img_name);
		cnt.add(box);
		box.addActionListener(this);
		setSize(500,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	 
	public static void main(String[] args) {
		new ImageDemo();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==box){
			String url=box.getSelectedItem().toString();
			String fullpath="image/"+url;
			icon=new ImageIcon(fullpath);
			lb1.setIcon(icon);

            Image img = icon.getImage();
            ImageIcon icon = new ImageIcon(fullpath);
            Image scaleImage = icon.getImage().getScaledInstance(28, 28, Image.SCALE_DEFAULT);
            repaint();
            pack();


			
		}
		
	}

}
