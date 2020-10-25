package simplejdbcProject;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class DatabaseMetaDataimpl {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("Database Minor version: "+dbmd.getDriverMinorVersion());
			System.out.println("Database Major version:"+dbmd.getDriverMajorVersion());
			System.out.println("Database Product name: "+dbmd.getDatabaseProductName());
			System.out.println("Database Product version: "+dbmd.getDatabaseProductVersion());
			System.out.println("Database supports transactions: "+dbmd.supportsTransactions());
			System.out.println("Database supports multiple transactions: "+
						dbmd.supportsMultipleTransactions());
			System.out.println("Database supports outer join: "+dbmd.supportsOuterJoins());
			System.out.println("Database supports stored procedures: "+
						dbmd.supportsStoredProcedures());
			System.out.println("Database supports batch updates: "+dbmd.supportsBatchUpdates());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
