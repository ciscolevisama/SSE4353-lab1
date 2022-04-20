package shopcalculator;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


//Name:Wang yida
//Matric:201406

public class SQLConnection {
	private static SQLConnection SqlConnect = null;
	
	private Connection conn = null;
	
	private Statement a = null;
	
	public static SQLConnection getInstance() {
		if (SqlConnect == null) {
			SqlConnect = new SQLConnection();
			}
		return SqlConnect;
		
	}
	
	public Statement getSQLConnection() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String databaseName = "Lab1";
		String username = "Wang yida";
		String pwd ="gk1234";
		
		try{
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url + databaseName, username, pwd);
			
			a = (Statement) conn.createStatement();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return a;
	}
	private SQLConnection() {
}
}
