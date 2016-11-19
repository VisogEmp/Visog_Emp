package statements;
import java.sql.*;
public class Delete {
//dsdd
	public static void main(String[] args) throws Exception {
		
		 Class.forName("com.mysql.jdbc.Driver");
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik","root","visog");
	     Statement stmt=con.createStatement();
	     String sql ="Delete  from employee  where  id in(1,	2)";
			
			int rs =stmt.executeUpdate(sql);
			
			System.out.println(rs +"rows affected");
         
                 
       
        
        
         con.close();
		}
		
	}


