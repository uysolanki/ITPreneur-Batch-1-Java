package day5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class DeleteUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp no");
		int eno=sc.nextInt();
		
		
		String query="delete from empitp where eno=?";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, eno);
		int n=ps.executeUpdate();
		
		if(n>0)
			System.out.println("Record Deleted");
		else
			System.out.println("Record Not Deleted");

	}

}
