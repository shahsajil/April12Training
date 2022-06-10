package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlUseView {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/sakila";
		String username = "root";
		String password = "Nep@lice51";

		Connection connect = DriverManager.getConnection(url, username, password);	
		Statement stmt = connect.createStatement();
		
		String query = "SELECT `actor_info`.`actor_id`,\r\n"
				+ "    `actor_info`.`first_name`,\r\n"
				+ "    `actor_info`.`last_name`,\r\n"
				+ "    `actor_info`.`film_info`\r\n"
				+ "FROM `sakila`.`actor_info` where actor_info.first_name ='Bob' and actor_info.last_name ='Fawcett'";

		ResultSet rs = stmt.executeQuery(query);

		while(rs.next())
		{
			int actor_id = rs.getInt("actor_id");
			String first_name = rs.getString("first_name");
			String last_name = rs.getString("last_name");
			String film_info = rs.getString("film_info");

			System.out.println("Actor_Id:" + actor_id +"   "+ "First_name:" + first_name +"   "+ "Last_name:" + last_name+"  "+ "Film_Info:" + film_info);
		}
		connect.close();
	}

}


