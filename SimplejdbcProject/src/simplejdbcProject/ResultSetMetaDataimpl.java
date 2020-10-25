package simplejdbcProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataimpl {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM EMP");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Total no. of column: "+rsmd.getColumnCount());
			System.out.println("Name of the column: "+rsmd.getColumnName(1));
			System.out.println("Data type of column: "+rsmd.getColumnTypeName(1));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
