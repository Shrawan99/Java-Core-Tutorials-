import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class tabbed extends JFrame{
	JTabbedPane jtp;
	public tabbed(){
	jtp=new JTabbedPane();
	jtp.add("AddRecord",new AddRecordPanel());
	jtp.add("Delete",new DeletePanel());
	add(jtp);
	setVisible(true);
	setSize(600,600);
	

}

public static void main(String[] args){
	new tabbed();
	}
}

 class AddRecordPanel extends JPanel implements ActionListener{
	JLabel l1;
	JTextField t1;
	JButton b1;
	public AddRecordPanel(){
		l1=new JLabel("name");
		t1=new JTextField(20);
		b1=new JButton("test");
		b1.addActionListener(this);
		add(l1);
		add(t1);
		add(b1);
		
	}

	//@Override
	public void actionPerformed(ActionEvent ee) {
		if(ee.getSource()==b1){
			JOptionPane.showMessageDialog(null, "your name is:"+t1.getText());
		}
		
	}
}
class DeletePanel extends JPanel{
	JLabel l1;
	JTextField t1;
	JButton b1;
	public DeletePanel(){
		l1=new JLabel("name");
		t1=new JTextField(20);
		b1=new JButton("delete");
		add(l1);
		add(t1);
		add(b1);
		}
	}

