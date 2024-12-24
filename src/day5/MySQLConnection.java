package day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
		public static Connection con;
		public static Connection getConnection() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itpdb","root",""); 
			return con;
		}
}
