package main.auth.db.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.auth.data.User;
import main.auth.util.HashUtil;
import main.config.DatabaseConfiguration;

public class LoginUtil {

	public static boolean login(String username, String password) {
		Connection connection = DatabaseConfiguration.getConnection();
		String sql = "select * from users where email=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, username);
			
			ResultSet rs = ps.executeQuery();
			String pwd = "";
			while(rs.next()) {
				pwd = rs.getString("password");
			}
			
			
			if(pwd.equals(HashUtil.hashString(password))) {
				return true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	public static User getUser(String email) {
		Connection connection = DatabaseConfiguration.getConnection();
		User user = new User();
		String sql = "select * from users where email=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, email);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setGender(rs.getString("gender"));
				user.setAge(rs.getInt("age"));
				user.setId(rs.getInt("id"));
			}
			
			
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	public static User getUserByID(Integer id) {
		Connection connection = DatabaseConfiguration.getConnection();
		User user = new User();
		String sql = "select * from users where id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setGender(rs.getString("gender"));
				user.setAge(rs.getInt("age"));
				user.setId(rs.getInt("id"));
			}
			
			
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}
