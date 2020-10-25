package simplejdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSet {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","shubham","7923");
			System.out.println("Got database connection");
			st = con.createStatement
					(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery("SELECT * FROM SHUBHAM");
			System.out.println("Displaying using next......");
			rs.next();
			System.out.print(rs.getInt("s_id"));
			System.out.print(rs.getString("s_name"));
			System.out.println(rs.getInt("salary"));
			System.out.println();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}