package main.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/main")
public class MainServletFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		 	HttpServletRequest httpRequest = (HttpServletRequest) request;
	        HttpSession session = httpRequest.getSession(true);
	        
	        Object user_id = session.getAttribute("user_id");
	        if(user_id!=null) chain.doFilter(request, response);
	        else {
//	        	response.getWriter().write("Authentication Error");
	        	HttpServletResponse res = (HttpServletResponse) response;
	        	res.sendRedirect("index.jsp");
	        }
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
