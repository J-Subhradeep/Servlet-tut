package main.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/main")
public class MainServletFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		System.out.println(request.getParameter("data"));
		if(Integer.parseInt(request.getParameter("data"))<=30)
		chain.doFilter(request, response);
		else
			response.getWriter().write("Error");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
