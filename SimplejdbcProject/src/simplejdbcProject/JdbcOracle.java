package simplejdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracle {

	public static void main(String[] args) {
		try {
			// step 1: load the database driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("hello");
			// step 2: get the database connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shubham","7923");
			System.out.println("how are you");
			// step 3: create statement
			Statement state = con.createStatement();
			// step 4: execute the statement
			ResultSet rs = state.executeQuery("select s_name,salary from SHUBHAM where s_id=10");
			
			while(rs.next()){
				//int id = rs.getInt(1);
				String name = rs.getString(1);
				int sal = rs.getInt("SALARY");
				System.out.println(name+"\t"+sal);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
