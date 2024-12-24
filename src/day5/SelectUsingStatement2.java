package day5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUsingStatement2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MySQLConnection.getConnection();
							//1      2
		Statement st = con.createStatement();
		String query = "select ename,sal from empitp where sal>1000";
		ResultSet rs = st.executeQuery(query);

		while(rs.next())
			System.out.println(rs.getString("ename") + " " + rs.getInt("sal"));
		
		
		rs.close();
		st.close();
		con.close();

	}

}
