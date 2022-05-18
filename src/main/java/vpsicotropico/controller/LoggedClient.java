package vpsicotropico.controller;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter("/")
public class LoggedClient extends HttpFilter {
       
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter LoggedClient");
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		String action = httpRequest.getParameter("action");
		boolean isUserLogged = httpRequest.getSession().getAttribute("userLogged") != null;
		boolean theresNeedFilter = 
				action == null || (!action.equals("Login") && !action.equals("LoginForm")); 
		
		
		
		System.out.println("Filter: is User Logged?" + isUserLogged);
		System.out.println("Filter: action: " + action);
		System.out.println();
		
		if(!isUserLogged && theresNeedFilter) {
			httpResponse.sendRedirect("?action=LoginForm");
			return;
		}
		chain.doFilter(httpRequest, httpResponse);
	}



}
