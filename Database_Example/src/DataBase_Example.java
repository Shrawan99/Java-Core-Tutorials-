import java.sql.*;

public class DataBase_Example {
	
	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/hacker","root","avr");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from hacker_list");
			while(rs.next()){
				System.out.println(rs.getInt(1)+")"+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(3));
				
			}
				}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			
		}
		

	}

}
