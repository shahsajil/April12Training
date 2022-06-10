package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlUpdate {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/sakila";
		String username = "root";
		String password = "Nep@lice51";

		Connection connect = DriverManager.getConnection(url, username, password);	
		Statement stmt = connect.createStatement();

		String query = "UPDATE store \r\n"
				+ "SET \r\n"
				+ "    last_update = '2022-06-08 12:32:12'\r\n"
				+ "WHERE\r\n"
				+ "    store_id= 2";

		int rows = stmt.executeUpdate(query); 
		if (rows > 0) { System.out.println("The timestamp has been updated"); }	
		connect.close();
	}
}
