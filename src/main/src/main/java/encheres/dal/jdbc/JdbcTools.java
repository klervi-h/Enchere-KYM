package encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import encheres.dal.Settings;

public class JdbcTools {
	private static Connection con;
	private static String url,user,password;

	static {
		try {
			Class.forName(Settings.getProperty("driver"));
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		url = Settings.getProperty("url");
		user = Settings.getProperty("user");
		password = Settings.getProperty("password");
		System.out.println("url="+url+";user="+user+";password="+password);
}
	
	public static Connection getConnection() throws SQLException{
		if(con == null || con.isClosed()) {
			con = DriverManager.getConnection(url,user,password);
		}
		return con;
	}

	public static void closeConnection() throws SQLException{
		if(con!= null) {
			con.close();
			con=null;
		}
	}

}
