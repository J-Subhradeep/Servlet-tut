package main.auth;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.auth.data.User;
import main.auth.db.util.LoginUtil;
import main.auth.util.HashUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = (String)req.getParameter("username");
		String password = (String)req.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		
		boolean login = LoginUtil.login(username, password);
		
		if(login) {
			User user = LoginUtil.getUser(username); 
			HttpSession session = req.getSession();
			session.setAttribute("user_id", user.getId().toString());
			resp.sendRedirect("dashboard.jsp");
		}
		else {
			req.setAttribute("loginerror", true);
			RequestDispatcher dispatcher= req.getRequestDispatcher("index.jsp");
			dispatcher.forward(req, resp);
		}
		
				
	}

}
