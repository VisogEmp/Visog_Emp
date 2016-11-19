package statements;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JDBCconnection {

	public static void main(String[] args) {
	       try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik","root","visog");
 
     if(con!=null)
     {
    	 //d
    	 System.out.println("successfull");
    	 
     }
     else
     {
    	 System.out.println("failed");
     }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
