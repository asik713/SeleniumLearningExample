package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mySqlConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/asik");
		Statement statement = 	connection.createStatement();
	    ResultSet result = 	statement.executeQuery("SELECT * FROM superheros");
	    
	    while(result.next()) {
	    	
	    	System.out.println("first : " + result.getString(1) + "second : " + result.getString(2));
	    }































		//		Class.forName("com.mysql.cj.jdbc.Driver");
		//		//Class.forName("com.mysql.cj.jdbc.Driver");
		//		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/asik");
		//		Statement statement = connection.createStatement();
		//		ResultSet result = statement.executeQuery("SELECT * FROM superheros");
		//
		//		while(result.next()) {
		//
		//			System.out.println("first : " + result.getString(1) + "second : " + result.getString(2) );

	}




























	// TODO Auto-generated method stub

	//		Class.forName("com.mysql.cj.jdbc.Driver");
	//		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/asik");
	//		Statement statement =   connection.createStatement();
	//		ResultSet result =  statement.executeQuery("SELECT * FROM superheros");
	//
	//		while(result.next()) {
	//
	//			System.out.println("first" + result.getString(1) + "Second" + result.getString(2));
	//		}
	//	}

}

