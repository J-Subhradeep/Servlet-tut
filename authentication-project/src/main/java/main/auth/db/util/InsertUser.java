package main.auth.db.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.auth.data.User;
import main.auth.util.HashUtil;
import main.config.DatabaseConfiguration;

public class InsertUser {

	public static boolean insertUser(User user) throws SQLException {
		Connection connection = DatabaseConfiguration.getConnection();
		String insertQuery = "INSERT INTO users (email, password, name, age, gender) " +
                "VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement ps = connection.prepareStatement(insertQuery);
		ps.setString(1, user.getEmail());
		ps.setString(2, HashUtil.hashString(user.getPassword()));
		ps.setString(3, user.getName());
		ps.setInt(4, user.getAge());
		ps.setString(5, user.getGender());
		
		boolean execute = ps.execute();
		return execute;

	}
}
