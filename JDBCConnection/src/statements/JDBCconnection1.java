package statements;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCconnection1 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik","root","visog");
			PreparedStatement pstm=con.prepareStatement("insert into employee values(?,?,?)");
			//sd
			pstm.setInt(1,3);
			pstm.setString(2, "rajesh");
			pstm.setInt(3, 2400);
					
			
			int i=pstm.executeUpdate();
			if(i>0){
				System.out.println("insertion Successfull");
			}
			else{
				System.out.println("insertion Failure");
			}
		}
}	

			
		
			
		
			
 

