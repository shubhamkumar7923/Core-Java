package simplejdbcProject;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementDemo {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cst1 = null;
		CallableStatement cst2 = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE","shubham","7923");
			System.out.println("got databse connection");
			cst2 = con.prepareCall("{CALL PROC2(?,?,?)}");
			cst2.setInt(1, 104);
			cst2.registerOutParameter(2, Types.INTEGER);
			cst2.registerOutParameter(3, Types.INTEGER);
			int q = cst2.executeUpdate();
			int t = cst2.getInt(2);
			int a = cst2.getInt(3);
			System.out.println("Value of q is: "+q);
			System.out.println("Total marks is: "+t);
			System.out.println("Average marks is: "+a);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
