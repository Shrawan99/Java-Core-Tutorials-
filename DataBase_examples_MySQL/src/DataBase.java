import java.sql.*;
public class DataBase {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/Java_Student","root","");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Student_list");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getInt(4));
	
			}
				}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		
		}
		

	}

}
