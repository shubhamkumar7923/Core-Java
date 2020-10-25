package simplejdbcProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersistingDOB {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = DBUtil.getConnection();
			String sqlQuerry = "INSERT INTO EMPDOB(NAME,DOB) VALUES "
					+ "('RAJESH',TO_DATE('31-12-2008','DD-MM-YYYY'))";
			st = con.createStatement();
			st.execute(sqlQuerry);
			System.out.println("Done.....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
