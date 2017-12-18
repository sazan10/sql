package sql;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Connector {
	private String username;
	private String password;
	Connector(String username,String password)
	{
		this.username=username;
		this.password=password;
	}

	public Connection getconnection() throws Exception {
	
		try {
			
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost/student";
			Class.forName(driver);
			java.sql.Connection conn = DriverManager.getConnection(url, username, password);
			return (Connection) conn;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
