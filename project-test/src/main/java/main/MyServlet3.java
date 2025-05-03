package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet3")
public class MyServlet3 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s = "Neladri";
//		resp.sendRedirect("home.jsp?user="+ s);
		
		req.setAttribute("user", s);
		RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
		
		dispatcher.forward(req, resp);
		
		
	}

}
