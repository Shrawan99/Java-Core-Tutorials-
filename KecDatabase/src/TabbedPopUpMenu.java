import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
public class TabbedPopUpMenu extends JFrame {
	public JTabbedPane jtp;
	public Container cnt;
	public JTextField tx1;
	public JLabel lb1,lb2,lb3,lb4;
	public JPanel mainPanel;
	Connection con;
	PreparedStatement stmt;
	ResultSet Rs;
	public JTextArea area1;
	public TabbedPopUpMenu(){
		super("Advance DataBase");
		jtp=new JTabbedPane();
		//jtp.add("AddRecord",new AddRecordPanel());
		//jtp.add("Delete",new DeletePanel());
		//jtp.add("View",new ViewPanel());
		add(jtp);
		setVisible(true);
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	public static void main(String[] args) {

	}

}
