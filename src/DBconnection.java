import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBconnection {
	public static void main(String [] args) { 
	String url= "jdbc:mysql://localhost:3306/siva";
	String un= "root";
	String psw= "root";
	Connection con;
	Statement stms;
	PreparedStatement pstm;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded suceffully");
		con = DriverManager.getConnection(url, un, psw);
		System.out.println("Connection established");
		stms = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,0);
	    String query = "delete from employees where employee_id=14";
	    String query1 = "delete from employees where employee_id=12";
	    
	    stms.executeUpdate(query);
	    stms.executeUpdate(query1);
	    System.out.println("Queries Excuted");
	    
	 
	   
	    stms.close();
		con.close();
	}
	catch(ClassNotFoundException  e){
		 
		e.printStackTrace();
		
	}
		catch(SQLException  e){
			 
			e.printStackTrace();
			
		}
	
		

}
}
