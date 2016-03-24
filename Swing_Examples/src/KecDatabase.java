import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KecDatabase extends JFrame implements ActionListener {
	public JLabel lb0, lb1, lb2, lb3, lb4, lb5;
	public JButton b1, b2,b3,search;
	public JTextField f0, f1, f2, f3, f4, f5;
	public JTextArea area1;
	public JScrollPane sl,sl1;
	Connection con;
	PreparedStatement stmt;
	ResultSet Rs;
	public Container cnt;
	public DefaultTableModel model=new DefaultTableModel();
	public JTable table;

	public KecDatabase() {
		super("Student Database");
		setVisible(true);
		//setSize(550, 600);
		cnt = getContentPane();
		setContentPane(new JLabel(new ImageIcon("image/secret.jpg")));
		//setSize(549, 599);
		cnt.setLayout(null);
		lb0 = new JLabel("Roll number");
		lb0.setForeground(Color.red);
		add(lb0);
		lb0.setBounds(150, 30, 100, 20);
		f0 = new JTextField(15);
		f0.setFont(new Font("Times Roman", Font.BOLD, 15));
		add(f0);
		f0.setBounds(240, 30, 100, 20);
		lb1 = new JLabel("User Name");
		lb1.setForeground(Color.red);
		add(lb1);
		lb1.setBounds(150, 60, 100, 20);
		f1 = new JTextField(15);
		f1.setFont(new Font("Times Roman", Font.BOLD, 15));
		add(f1);
		f1.setBounds(240, 60, 100, 20);
		lb2 = new JLabel("First Name");
		lb2.setForeground(Color.red);
		add(lb2);
		lb2.setBounds(150, 90, 100, 20);
		f2 = new JTextField(15);
		f2.setFont(new Font("Times Roman", Font.BOLD, 15));
		add(f2);
		f2.setBounds(240, 90, 100, 20);
		lb3 = new JLabel("Last Name");
		lb3.setForeground(Color.red);
		add(lb3);
		lb3.setBounds(150, 120, 100, 20);
		f3 = new JTextField(15);
		f3.setFont(new Font("Times Roman", Font.BOLD, 15));
		add(f3);
		f3.setBounds(240, 120, 100, 20);
		lb4 = new JLabel("Address");
		lb4.setForeground(Color.red);
		add(lb4);
		lb4.setBounds(150, 150, 100, 20);
		f4 = new JTextField(15);
		f4.setFont(new Font("Times Roman", Font.BOLD, 15));
		add(f4);
		f4.setBounds(240, 150, 100, 20);
		b1 = new JButton("Save");
		b1.addActionListener(this);
		add(b1);
		b1.setBounds(15, 180, 100, 20);
		search= new JButton("Search");
		search.addActionListener(this);
		add(search);
		search.setBounds(120, 180, 100, 20);
        /*area1 = new JTextArea(25, 30);
		area1.setFont(new Font("Times Roman", Font.BOLD, 15));
		cnt.add(area1);

		area1.setBounds(50, 220, 400, 300);
		sl = new JScrollPane(area1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sl.setPreferredSize(new Dimension(200, 100));
		sl.setBounds(50, 220, 400, 300);
		cnt.add(sl);*/
		table=new JTable(model);
		table.setBounds(10, 220, 550, 350);
		table.setFont(new Font("Times Roman", Font.BOLD, 15));
		model.addColumn("Roll-No");
		model.addColumn("User Name");
		model.addColumn("First Name");
		model.addColumn("Last Name");
		model.addColumn("Address");
		sl1=new JScrollPane(table);
		sl1.setBounds(10, 220, 550, 350);
		add(sl1);
		b2 = new JButton("View");
		b2.addActionListener(this);
		add(b2);
		b2.setBounds(230, 180, 100, 20);
	
		b3 = new JButton("Delete");
		b3.addActionListener(this);
		add(b3);
		b3.setBounds(340, 180, 100, 20);

		lb5 = new JLabel("By Shrawan Tech");
		lb5.setForeground(Color.white);
		lb5.setBounds(400, 580,100, 40);
		add(lb5);
		cnt.setBackground(Color.GREEN);
		setLocationRelativeTo(null);
		setSize(580, 610);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new KecDatabase();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, "Welcome to KEC_B DataBase.");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost/BEX_B","root","hacker");
				stmt = con
						.prepareStatement("INSERT INTO student_list(roll_no,username,fiRstname,lastname,address) values (?,?,?,?,?)");
				String roll = f0.getText();
				int roll_no = Integer.parseInt(roll);
				String user = f1.getText();
				Pattern pt_user=Pattern.compile("[a-zA-Z0-9]{2,}");
				Matcher mt_user=pt_user.matcher(user);
				if(mt_user.matches()){
					JOptionPane.showMessageDialog(null, "valid user");
					String fiRstname = f2.getText();
					String lastname = f3.getText();
					String address = f4.getText();
					stmt.setInt(1, roll_no);
					stmt.setString(2, user);
					stmt.setString(3, fiRstname);
					stmt.setString(4, lastname);
					stmt.setString(5, address);
					int i = stmt.executeUpdate();
					if (i == 1) {
						JOptionPane
								.showMessageDialog(null, "Recently added data is:"
										+ "\r\nroll_no=" + roll_no + "  "
										+ "\r\nUserName=" + user + "  "
										+ "\r\nName=" + fiRstname + " " + lastname
										+ " " + "\r\nAddress=" + address);

					} else {
						JOptionPane
								.showMessageDialog(null, "Sorry data not added:");
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "not valid user");
				}
				String fiRstname = f2.getText();
				String lastname = f3.getText();
				String address = f4.getText();
				stmt.setInt(1, roll_no);
				stmt.setString(2, user);
				stmt.setString(3, fiRstname);
				stmt.setString(4, lastname);
				stmt.setString(5, address);
				int i = stmt.executeUpdate();
				if (i == 1) {
					JOptionPane
							.showMessageDialog(null, "Recently added data is:"
									+ "\r\nroll_no=" + roll_no + "  "
									+ "\r\nUserName=" + user + "  "
									+ "\r\nName=" + fiRstname + " " + lastname
									+ " " + "\r\nAddress=" + address);

				} else {
					JOptionPane
							.showMessageDialog(null, "Sorry data not added:");
				}
				f2.setText("");
				f1.setText("");
				f4.setText("");
				f3.setText("");
				f5.setText("");
				

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}

		} else if (e.getSource() == b2) {
			model.setRowCount(0);
			JOptionPane.showMessageDialog(null, "Welcome to DataBase");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost/BEX_B", "root", "hacker");
				stmt = con.prepareStatement("SELECT *FROM student_list");
				Rs = stmt.executeQuery();
				while (Rs.next()) {
					/*area1.append("\r\n");
					area1.append("     " + "Roll-no=" + Rs.getInt(1) + "\r\n"
							+ "     " + "User Name=" + Rs.getString(2) + "\r\n"
							+ "     " + "Name=" + Rs.getString(3) + ""
							+ Rs.getString(4) + "\r\n" + "     " + "Address="
							+ Rs.getString(5));
					area1.append("\r\n");
					area1.append("\r\n");
					area1.append("*****" + "Next" + "*****");
					area1.append("\r\n");
					area1.append("\r\n");
					JOptionPane.showMessageDialog(null,"ID number="+Rs.getInt(1)+"\r\nUser Name="+Rs.getString(2)+"\r\nName="+Rs.getString(3)+" "+Rs.getString(4)+""+"\r\nAddress="+Rs.getString(5));*/
					model.addRow(new Object[]{Rs.getInt(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(5)});
					
						
				}
				
			} catch (Exception ex) {
				System.out.println(ex.getMessage());

			}

		}
		else if(e.getSource()==b3){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost/BEX_B","root","hacker");
				stmt=con.prepareStatement("DELETE FROM student_list where roll_no=? ") ;
				String roll = f0.getText();
				int roll_no = Integer.parseInt(roll);
				stmt.setInt(1, roll_no);
				int i=stmt.executeUpdate();
				if(i==1){
					JOptionPane.showMessageDialog(null, "Recently deleted data is:"
							+ "\r\nroll_no=" + roll_no);
				       }
				else{
					JOptionPane.showMessageDialog(null, "Data not found");
				}
			}
				catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
              }
		else if(e.getSource()==search){
			JOptionPane.showMessageDialog(null, "Welcome to search zone");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost/BEX_B", "root", "hacker");
				stmt = con.prepareStatement("SELECT *FROM student_list where roll_no=?");
				
				String roll=f0.getText();
				int roll_no=Integer.parseInt(roll);
				stmt.setInt(1, roll_no);
				Rs = stmt.executeQuery();
				while (Rs.next()) {
					JOptionPane.showMessageDialog(null,"Roll_no="+Rs.getInt(1)+"\r\nUser Name="+Rs.getString(2)+"\r\nName="+Rs.getString(3)+" "+Rs.getString(4)+""+"\r\nAddress="+Rs.getString(5));
					
					
				}
			
			
		}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
}
}
}
