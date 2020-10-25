package simplejdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("hello");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shubham","7923");
			PreparedStatement smt = con.prepareStatement("insert into SHUBHAM values(?,?,?)");
			smt.setInt(1, 10);
			smt.setString(2, "Kong");
			smt.setInt(3, 60000);
			int i = smt.executeUpdate();
			System.out.println(i+" values inserted");
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
