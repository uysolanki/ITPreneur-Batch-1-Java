package day5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MySQLConnection.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp no");
		int eno=sc.nextInt();
		
		System.out.println("Enter Emp name");
		String ename=sc.next();
		
		System.out.println("Enter Emp salary");
		int sal=sc.nextInt();
		
		
		String query="{call emppro(?,?,?,?)}";
		CallableStatement cs=con.prepareCall(query);
		
		cs.setInt(1, eno);
		cs.setString(2, ename);
		cs.setInt(3, sal);
		cs.registerOutParameter(4, java.sql.Types.VARCHAR);
		cs.executeUpdate();
		
		String result=cs.getString(4);
		
		if(result.equals("true"))
			System.out.println("Record Inseted");
		else
			System.out.println("Record Not Inserted");
		
	
		cs.close();
		con.close();

	}
}
/*
 DELIMITER &&  
CREATE PROCEDURE emppro(in peno int(5),in pename varchar(20),in psal int(20), out itp varchar(20))
	BEGIN 
	insert into empitp values(peno,pename,psal);
        set itp='true';
END &&  
DELIMITER;
*/
