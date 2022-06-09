package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlSelectCities {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/sakila";
		String username = "root";
		String password = "Nep@lice51";

		Connection connect = DriverManager.getConnection(url, username, password);
		Statement stmt = connect.createStatement();
		String query = "SELECT city FROM city ORDER BY city DESC LIMIT 10";

		ResultSet rs = stmt.executeQuery(query);

		while(rs.next())
		{
			String city = rs.getString("city");

			System.out.println("City:" + city);
		}
		connect.close();
	}
}

