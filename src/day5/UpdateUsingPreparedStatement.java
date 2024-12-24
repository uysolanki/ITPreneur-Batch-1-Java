package day5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnection.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp no to update");
		int eno=sc.nextInt();
		
		System.out.println("Enter the new Emp name");
		String ename=sc.next();
		
		System.out.println("Enter the increment amount");
		int sal=sc.nextInt();
		
		
		String query = "update empitp set sal=sal+?,ename=? where eno=?";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, sal);
		ps.setString(2, ename);
		ps.setInt(3, eno);
		
		int n=ps.executeUpdate();
		
		if(n>0)
			System.out.println("Record Updated");
		else
			System.out.println("Record Not Updated");

	}

}
