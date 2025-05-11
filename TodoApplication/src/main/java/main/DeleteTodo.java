package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.auth.db.util.DeleteTodoUtil;

@WebServlet("/delete_todo")
public class DeleteTodo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("id").toString());
		System.out.println(id);
		DeleteTodoUtil.deleteTodo(id);
		
		resp.sendRedirect("/TodoApplication/main");
	}

	
}
