package main;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.conf.DatabaseConfiguration;
import main.data.Student;


@WebServlet("/testDB")
public class TestDBServlet extends HttpServlet {

	private Connection conn;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		conn = DatabaseConfiguration.getConnection();
		String sql = "select * from student";
		List<Student> listOfStudents = new ArrayList<Student>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Student student = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("mobile"), rs.getString("roll"));
				listOfStudents.add(student);
			}
			
			req.setAttribute("students", listOfStudents);
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
			dispatcher.forward(req, resp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	
}
