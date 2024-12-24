package day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingBatch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itpdb","root","");  
		
		Statement st=con.createStatement();
		String query1="insert into empitp values(3,'Virat',1900)";
		String query2="insert into empitp values(4,'Rohit',900)";
		String query3="insert into empitp values(6,'Hardik',1600)";
		
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		
		int rows[]=st.executeBatch();
		if(rows.length>0)
			System.out.println("Records Inserted");
		else
			System.out.println("Records Not Inserted");
	}
}
