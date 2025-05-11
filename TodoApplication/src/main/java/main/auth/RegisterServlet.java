package main.auth;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.auth.data.User;
import main.auth.db.util.InsertUser;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = (String)req.getParameter("name");
		String username = (String)req.getParameter("username");
		String password = (String)req.getParameter("password");
		Integer age = Integer.parseInt(req.getParameter("age"));
		String gender = (String)req.getParameter("gender");
		User user = new User(username, password, name, age, gender);
		try {
			InsertUser.insertUser(user);
			resp.sendRedirect("index.jsp?registerd="+true);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
				
	}
}
