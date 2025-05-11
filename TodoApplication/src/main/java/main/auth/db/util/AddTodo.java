package main.auth.db.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.config.DatabaseConfiguration;

public class AddTodo {

	public static void addTodo(String title, int user_id) {
		String sql = "insert into todos (title, user_id) values (?,?)";
		
		Connection connection = DatabaseConfiguration.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, title);
			statement.setInt(2, user_id);
			
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
