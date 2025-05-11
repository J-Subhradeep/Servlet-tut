package main.auth.db.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import main.auth.data.Todo;
import main.config.DatabaseConfiguration;

public class FetchTodo {
	public static List<Todo> getTodos(int user_id){
		Connection connection = DatabaseConfiguration.getConnection();
		List<Todo> list = new LinkedList<Todo>();
		try {
			PreparedStatement statement = connection.prepareStatement("select * from todos where user_id=?");
			statement.setInt(1, user_id);
			
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				Todo t = new Todo();
				t.setId(rs.getInt("id"));
				t.setTitle(rs.getString("title"));
				t.setUser_id(rs.getInt("user_id"));
				
				list.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
}
