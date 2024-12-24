package day5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnection.getConnection();
		
		Statement st=con.createStatement();
		String query="delete from empitp where eno=3";
		int n=st.executeUpdate(query);
		
		if(n>0)
			System.out.println("Record Deleted");
		else
			System.out.println("Record Not Deleted");

	}

}
