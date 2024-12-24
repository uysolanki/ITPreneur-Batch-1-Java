package day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itpdb","root","");  
		
		Statement st=con.createStatement();
		String query="insert into empitp values(1,'Alice',800)";
		int n=st.executeUpdate(query);
		
		if(n>0)
			System.out.println("Record Inserted");
		else
			System.out.println("Record Not Inserted");
	}

}
