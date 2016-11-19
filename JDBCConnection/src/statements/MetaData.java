package statements;
import java.sql.*;

import com.mysql.jdbc.ResultSetMetaData;


public class MetaData {

	//d
	public static void main(String args[]) {
	    try{
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik","root","visog");
	    PreparedStatement ps=con.prepareStatement("select * from employee");
	    ResultSet rs=ps.executeQuery();
	    ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
	    
	    System.out.println("Total Columns:"+rsmd.getColumnCount());
	    System.out.println("Column Name of First Column:"+rsmd.getColumnName(1));
	    System.out.println("Column Type of first Colum:"+rsmd.getColumnTypeName(1));
      con.close();
	}
		
	 catch (Exception e) {
		System.out.println(e);
	}

}}
