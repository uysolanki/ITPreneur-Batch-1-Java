package day5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class InsertUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnection.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp no");
		int eno=sc.nextInt();
		
		System.out.println("Enter Emp name");
		String ename=sc.next();
		
		System.out.println("Enter Emp salary");
		int sal=sc.nextInt();
		
		
		String query="insert into empitp values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		
		
		ps.setInt(1, eno);
		ps.setString(2, ename);
		ps.setInt(3, sal);
		
		int n=ps.executeUpdate();
		
		if(n>0)
			System.out.println("Record Inserted");
		else
			System.out.println("Record Not Inserted");

	}

}
