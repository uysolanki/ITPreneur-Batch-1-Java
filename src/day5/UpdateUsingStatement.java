package day5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MySQLConnection.getConnection();

		Statement st = con.createStatement();
		String query = "update empitp set sal=sal+100,ename='Cruise' where eno=5";
		int n = st.executeUpdate(query);

		if (n > 0)
			System.out.println("Record Updated");
		else
			System.out.println("Record Not Updated");
	}

}
