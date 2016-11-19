
package statements;
//ss

import java.sql.*;
import java.util.Scanner;
import java.io.*;

 class Insert {

	public static void main(String args [] ) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik","root","visog");
		PreparedStatement stmt=con.prepareStatement(""
				+ " from employee where id=?");
		Scanner scan=new Scanner(System.in);
		
			
			System.out.println("enter id:");
			int id=scan.nextInt();
			stmt.setInt(1, id);
			 
			int i=stmt.executeUpdate();
			System.out.println("records Affected");
			
			
			
			
				
				
			
		
			
				
			con.close();
		} }
		
	



