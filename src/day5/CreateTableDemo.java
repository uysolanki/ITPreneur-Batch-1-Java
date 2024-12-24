package day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableDemo {
 
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itpdb","root","");  
//		System.out.println(con.isClosed());
		
		Statement st=con.createStatement();
		
		String query="create table empitp(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(10),\r\n"
				+ "sal int(5))";
		
		st.execute(query);
		System.out.println("Table Created");
		
		st.close();
		con.close();
//		System.out.println(con.isClosed());
		
	}

}
