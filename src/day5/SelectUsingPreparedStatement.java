package day5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnection.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base salary");
		int bsal=sc.nextInt();
		
		
		String query = "select ename,sal from empitp where sal>=?";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, bsal);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
			System.out.println(rs.getString("ename") + " " + rs.getInt("sal"));
		
		
		rs.close();
		ps.close();
		con.close();
	}

}
