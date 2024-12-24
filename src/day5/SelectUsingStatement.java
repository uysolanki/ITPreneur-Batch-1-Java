package day5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MySQLConnection.getConnection();
							//1      2
		Statement st = con.createStatement();
		String query = "select ename,sal from empitp where eno=1";
		ResultSet rs = st.executeQuery(query);

		if(rs.next())
			System.out.println(rs.getString("ename") + " " + rs.getInt("sal"));
		
		
		rs.close();
		st.close();
		con.close();

	}

}
