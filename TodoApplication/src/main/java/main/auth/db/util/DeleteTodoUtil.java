package main.auth.db.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.config.DatabaseConfiguration;

public class DeleteTodoUtil {

	public static  void deleteTodo(int id) {
		String sql = "delete from todos where id=?";
		Connection conn = DatabaseConfiguration.getConnection();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id);
			
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
