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
public class SecondaryFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
//		Data base connection get
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		if(Integer.parseInt( request.getParameter("data"))%2==0) {
			chain.doFilter(request, response);
		}
		else 
			response.getWriter().write("Error 2");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

//		data base connection close
		
	}

}
