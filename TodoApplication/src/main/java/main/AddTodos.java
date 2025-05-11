package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.auth.db.util.AddTodo;

@WebServlet("/add_todo")
public class AddTodos extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("addtodo.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		int user_id = Integer.parseInt(session.getAttribute("user_id").toString());
		
		String title = req.getParameter("todo");
		
		AddTodo.addTodo(title, user_id);
		
		resp.sendRedirect("/TodoApplication/main");
	}

	
}
