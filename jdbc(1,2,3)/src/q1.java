import java.sql.*;
public class q1{
	public static void main(String args[]) {
		Connection conn;
		//String driver="com.mysql.jdbc.Driver";
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
			String q = "select No_of_Employees from department where Name='CSE'";
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery(q);
			rs.next();
			System.out.println("no of emps "+rs.getInt(1));
			q="select Dept_ID,Name from department where Year_Established=2010";
			rs = s.executeQuery(q);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}