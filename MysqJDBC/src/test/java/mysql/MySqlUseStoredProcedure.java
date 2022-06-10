package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlUseStoredProcedure {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/sakila";
		String username = "root";
		String password = "Nep@lice51";

		Connection connect = DriverManager.getConnection(url, username, password);
		Statement stmt = connect.createStatement();
		
		String query = "SELECT title, store_id, inventory_id FROM film, inventory\r\n"
				+ "	WHERE title = \"Alien Center\" and store_id=2 and inventory_id limit 4";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next())
		{
			String title = rs.getString("title");
			int store_id = rs.getInt("store_id");
			int inventory_id = rs.getInt("inventory_id");
			
			System.out.println("Title:" + title + "  " + "Store_Id:" + store_id + "  " + "Inventory_id:" + inventory_id);
		}
		connect.close();
		
	}

}
