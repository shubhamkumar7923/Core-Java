package simplejdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStatement {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","shubham","7923");
			//PreparedStatement smt = con.prepareStatement
				//	("update SHUBHAM set S_NAME='SATYA' where S_ID=1");
			PreparedStatement smt = con.prepareStatement
					("delete from SHUBHAM where S_ID=106");
			//smt.setString(2, "SHUBHAM");
			//smt.setInt(1, 1);
			int i = smt.executeUpdate();
			System.out.println(i +" value updated");
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
