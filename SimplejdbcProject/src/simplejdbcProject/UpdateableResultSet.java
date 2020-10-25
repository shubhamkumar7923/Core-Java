package simplejdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateableResultSet {

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
					(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("SELECT s_id,s_name,salary FROM SHUBHAM");
			System.out.println("Before updating......");
			while(rs.next()){
				System.out.print(rs.getInt("s_id")+"\t");
				System.out.print(rs.getString("s_name")+"\t");
				System.out.println(rs.getInt("salary"));
				System.out.println();
			}
			rs.absolute(4);
			rs.updateString(2, "aaaaa");
			rs.updateInt("salary", 5555);
			rs.updateRow();
			rs.absolute(3);
			rs.deleteRow();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
