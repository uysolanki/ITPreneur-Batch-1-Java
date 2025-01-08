package day5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=OracleConnection.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer no");
		int a=sc.nextInt();
		
		System.out.println("Enter Customer name");
		String b=sc.next();
		
		System.out.println("Enter Customer Phone");
		String c=sc.next();
		
		System.out.println("Enter Customer City");
		String d=sc.next();
		
		System.out.println("Enter Customer Gender");
		String e=sc.next();
		
		
		String query="{call procInsCust1(?,?,?,?,?,?)}";
		CallableStatement cs=con.prepareCall(query);
		
		cs.setInt(1, a);
		cs.setString(2, b);
		cs.setString(3,c);
		cs.setString(4,d);
		cs.setString(5,e);
		cs.registerOutParameter(6, java.sql.Types.NUMERIC);
		cs.executeUpdate();
		
		int result=cs.getInt(6);
		
		if(result==1)
			System.out.println("Record Inseted");
		else
			System.out.println("Record Not Inserted");
		
	
		cs.close();
		con.close();

	}
}
/*
  C:\oraclexe\app\oracle\product\11.2.0\server\jdbc
create or replace procedure procInsCust1(pcid in customer.cid%type,
   pcname in customer.cname%type,
    pphone in customer.cphone%type,
    pcity in customer.ccity%type,
   pgen in customer.cgender%type,
   result out number)
    is
  begin
   insert into customer values(pcid,pcname,pphone,pcity,pgen);
  result:=1;
  exception
  when others then
  result:=0;
   end;
  /
*/


