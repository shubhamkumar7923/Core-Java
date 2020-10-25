package simplejdbcProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EMPLogin {

	private static void persistingSQLDate() throws ClassNotFoundException, SQLException
	{
		Connection con= DBUtil.getConnection();
		String sqlQuery="INSERT INTO EMPLOGIN (NAME,LOGIN) VALUES (?,?)";
		java.util.Date date=new java.util.Date();
		System.out.println("Util date :"+date);
		java.sql.Date sqlDate =new java.sql.Date(date.getTime());
		System.out.println("SQL date :"+sqlDate);
		PreparedStatement pst=null;
		pst=con.prepareStatement(sqlQuery);
		pst.setString(1, "PROD");
		pst.setDate(2, sqlDate);
		pst.execute();
		
	}
	private static void retrivingDateFromDB() throws ClassNotFoundException, SQLException
	{
		Connection con= DBUtil.getConnection();
		ResultSet rs;
		Statement st=con.createStatement();
		rs=st.executeQuery("SELECT NAME, LOGIN FROM EMPLOGIN");
		while(rs.next())
		{
			String s=rs.getString(1);
			java.util.Date date=rs.getDate(2);
			System.out.println(s +"\t"+ date);
		}
		
	}
	public static void main(String[] args) {
		try {
			persistingSQLDate();		
		    retrivingDateFromDB();
		    System.out.println("Done.....");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
