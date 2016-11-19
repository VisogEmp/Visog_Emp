package statements;
import java.sql.*;



public class Update {

	//ss
	public static void main(String[] args) {
            try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik","root","visog");
          PreparedStatement stmt=con.prepareStatement("update employee set name=? where id=?");
          stmt.setString(1,"suresh");
          
          
          stmt.setInt(2, 5);
          
          int i=stmt.executeUpdate();
          System.out.println(i+"records updated");
          con.close();
          
	}catch(Exception e){System.out.println(e);
	}
}
}