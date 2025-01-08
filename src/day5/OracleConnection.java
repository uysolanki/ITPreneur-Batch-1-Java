package day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
		public static Connection con;
		public static Connection getConnection() throws ClassNotFoundException, SQLException
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
			return con;
		}
}
