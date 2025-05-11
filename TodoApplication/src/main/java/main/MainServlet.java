package main;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.auth.data.Todo;
import main.auth.db.util.FetchTodo;
import main.config.DatabaseConfiguration;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		FetchTodo.getTodos(0)
		HttpSession session = req.getSession();
		int user_id = Integer.parseInt(session.getAttribute("user_id").toString());
		
		
		List<Todo> todos = FetchTodo.getTodos(user_id);
		System.out.println(todos);
		req.setAttribute("todos", todos);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("main.jsp");
		dispatcher.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

	
}
